package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transaction;

public class DataModel {
	private DataModel() {

	}

	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple("A1", "green", 200, "VietNam"), 
				new Apple("A2", "red", 400, "Lao"),
				new Apple("A3", "blue", 600, "Thailand"), 
				new Apple("A4", "green", 800, "VietNam"),
				new Apple("A5", "red", 100, "VietNam"), 
				new Apple("A6", "yellow", 200, "VietNam"),
				new Apple("A7", "green", 200, "VietNam"), 
				new Apple("A8", "red", 500, "Lao"),
				new Apple("A9", "blue", 100, "Thailand"), 
				new Apple("A10", "yellow", 200, "VietNam"));
	}

	public static List<Trader> getTraders() {
		return Arrays.asList(
				new Trader("Raoul", "Cambridge"), 
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"), 
				new Trader("Brian", "Cambridge"));
	}

	public static List<Transaction> getTransactions() {
		List<Trader> traders = getTraders();
		return Arrays.asList(
				new Transaction(traders.get(3), 2011, 300), 
				new Transaction(traders.get(0), 2012, 1000),
				new Transaction(traders.get(0), 2011, 400), 
				new Transaction(traders.get(1), 2012, 710),
				new Transaction(traders.get(1), 2012, 700),
				new Transaction(traders.get(2), 2012, 950));
	}
}
