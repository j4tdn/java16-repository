package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
	
	}

	public static List <Trader> getTraders(){
		return List.of(
				new Trader(0, "Terry", "London"),
				new Trader(2, "Kasa", "Brasil"),
				new Trader(4, "Adam", "Milan")
				);
	}
}
