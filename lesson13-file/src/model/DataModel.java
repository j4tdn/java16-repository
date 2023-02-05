package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Trader> getTraders() {
		//[id], name, address
		return List.of(
			new Trader(1, "Terry", "London"), 
			new Trader(2, "KaKa", "Brasil"),
			new Trader(3, "Adam", "Milan")
		);
	}
}
