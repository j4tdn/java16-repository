package model;

import java.util.Arrays;
import java.util.List;

import designpartterns.strategy.Apple;
import bean.Transaction;
import bean.Trade;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple("A1", "green", 200d, "VietNam"),
				new Apple("A2", "red", 400d, "Lao"),
				new Apple("A3", "blue", 600d, "Thailand"),
				new Apple("A4", "green", 200d, "Brunei"),
				new Apple("B1", "red", 800d, "VietNam"),
				new Apple("B2", "yellow", 100d, "VietNam"),
				new Apple("B3", "green", 700d, "VietNam"),
				new Apple("B4", "yellow", 500d, "Lao"));
	}
	
	
	public static List<Trade> getTraders(){
		return Arrays.asList(
				new Trade("Raoul", "Cambridge"),
		        new Trade("Mario", "Milan"),
		        new Trade("Alan", "Cambridge"),
		        new Trade("Brian", "Cambridge"));
	}
	
	public static List<Transaction> getTransactions(){
		Trade raoul = new Trade("Raoul", "Cambridge");
        Trade mario = new Trade("Mario", "Milan");
        Trade alan = new Trade("Alan", "Cambridge");
        Trade brian = new Trade("Brian", "Cambridge");
		
		return Arrays.asList(
				new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
	}
	
}
