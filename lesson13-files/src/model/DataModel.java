package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Trader> getTrader(){
		// [id], name, address
		return List.of(
			new Trader(0, "Terry", "London", "ot@gmail.com"),
			new Trader(2, "Kaka", "Brasil", "2k@gmail.com"),
			new Trader(4, "Adam", "Milan", "4m@gmail.com")
			);
				
	}
}
