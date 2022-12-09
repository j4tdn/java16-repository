package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transacions;

public class DataModel {
	private DataModel(){
		
	}
	public static List<Trader> getTraders() {
		List<Trader> traders = new ArrayList<>();
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);
		
		return traders;
	}
	public static List<Transacions> getTransaction() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transacions> transactions = Arrays.asList(
			new Transacions(brian, 2011, 300),
			new Transacions(raoul, 2012, 1000), 
			new Transacions(raoul, 2011, 400),
			new Transacions(mario, 2012, 710), 
			new Transacions(mario, 2012, 700), 
			new Transacions(alan, 2012, 950)
		);
		return transactions;
	}
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple("a1", "red", 200, "viet nam"),
				new Apple("a2", "green", 300, "mi"),
				new Apple("a3", "green", 400, "viet nam"),
				new Apple("a4", "yello", 500, "capuchia"),
				new Apple("a5", "red", 600, "han")
				);
	}

}
