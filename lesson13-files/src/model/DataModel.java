package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Trader> getTraders(){
		return List.of(
				new Trader(1, "Terry", "London", "abc@gmail.com"),
				new Trader(2, "Kaka", "Brazil", "2ab@gmail.com"),
				new Trader(3, "Adam", "Milan", "ka12@gmail.com"));
	}

}
