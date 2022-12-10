package model;

import java.util.ArrayList;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Trader> getTraders() {
		List<Trader>  traders= new ArrayList<>();
		traders.add(new Trader("Raoul","Cambridge"));
		traders.add(new Trader("Mario","Milan"));
		traders.add(new Trader("Alan","Cambridge"));
		traders.add(new Trader("Brian","Cambridge"));
		return traders;
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(brian, 2011, 300));
		transactions.add(new Transaction(raoul, 2012, 1000));
		transactions.add(new Transaction(brian, 2011, 400));
		transactions.add(new Transaction(mario, 2012, 710));
		transactions.add(new Transaction(mario, 2012, 700));
		transactions.add(new Transaction(alan, 2012, 950));
		return transactions;
	}
}
