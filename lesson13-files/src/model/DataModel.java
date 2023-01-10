package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
	}

	public static List<Trader> getTraders() {
		return List.of(
				new Trader(0, "Terry", "London", "abc@gmail"), 
				new Trader(2, "Kaka", "Brasil", "2a@gmail.com"),
				new Trader(4, "Adam", "Milan", "a@gmail.com"));
	}
}
