package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	private DataModel() {
	}

	public static List<Trader> getTraders() {
		return Arrays.asList(new Trader("Raoul", "Cambridge"), new Trader("Mario", "MiLan"),
				new Trader("Alan", "Cambridge"), new Trader("Brian", "Cambridge")

		);
	}

	public static List<Transaction> getTransactions() {
		List<Trader> traders = getTraders();
		return Arrays.asList(
			new Transaction(getTraders().get(3), 2011, 300),
			new Transaction(getTraders().get(0), 2012, 1000),
			new Transaction(getTraders().get(0), 2011, 400),
			new Transaction(getTraders().get(1), 2012, 710),
			new Transaction(getTraders().get(1), 2012, 700),
			new Transaction(getTraders().get(2), 2012, 950)
		);
	}

}
