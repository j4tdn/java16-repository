package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import predemo.Trader;
import predemo.Transaction;

public class DataModelTransation {
	private  DataModelTransation() {
		
	}
	static Trader raoul = new Trader ("Raoul","Cambridge");
	static Trader mario = new Trader ("Mario","Milan");
	static Trader alan = new Trader ("Alan","Cambridge");
	static Trader brian = new Trader ("Brian","Cambridge");
	

	public static List<Trader> getTrades() {
		List<Trader> listTrade = new ArrayList<>(); 
		listTrade.add(raoul);
		listTrade.add(mario);
		listTrade.add(alan);
		listTrade.add(brian);
		return listTrade;

	}
	public static List<Transaction> getTransaction(){
		return Arrays.asList(
				new Transaction(brian,2011,300),
				new Transaction(raoul,2012,1000),
				new Transaction(raoul,2011,400),
				new Transaction(mario,2012,710),
				new Transaction(mario,2012,700),
				new Transaction(alan,2012,900)
				
		);
		
	}

}
	