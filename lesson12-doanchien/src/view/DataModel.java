package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Trader> getTraders(){
		List<Trader> traders = new ArrayList<>();
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan  = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);
		
		return traders;
	}
	
	public static List<Transaction> getTransactions(){
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan  = new Trader("Alan", "Cambridge");
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
