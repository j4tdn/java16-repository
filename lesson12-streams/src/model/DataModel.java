package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transaction;

public class DataModel {
	private DataModel() {		
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple("A1","green", 200,"VietNam"),
				new Apple("A2","red", 400 ,"Laos"),
				new Apple("A3","blue", 600,"Thailand"),
				new Apple("A4","green", 200,"Brunei"),
				new Apple("B1","red", 800,"VietNam"),
				new Apple("B2","yellow", 100,"VietNam"),
				new Apple("B3","green", 700,"VietNam"),
				new Apple("B4","green", 500,"Laos")
		);
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
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
}
