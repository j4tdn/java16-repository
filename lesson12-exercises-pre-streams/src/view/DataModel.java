package view;



import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	private DataModel() {

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

