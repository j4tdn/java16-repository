package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Trader> getTraders(){
		return List.of(
			new Trader(1, "Terry", "London", "0t@gmail.com"),
			new Trader(2, "Kaka", "Brasil", "2k@gmail.com"),
			new Trader(3, "Adam", "Milan", "4a@gmail.com"),
			new Trader(4, "Lyly", "Paris", "9h@gmail.com")
		);
	}
}
