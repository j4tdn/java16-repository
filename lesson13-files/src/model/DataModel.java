package model;

import java.util.List;

import bean.Trader;

public class DataModel {

	public DataModel() {
		
	}
	public static List<Trader> getTraders()
	{
		return List.of(
				new Trader(1, "Terry1", "London1", "1@gmail.com"),
				new Trader(2, "Terry2", "London2", "2@gmail.com"),
				new Trader(3, "Terry3", "London3", "3@gmail.com"),
				new Trader(4, "Terry4", "London4", "4@gmail.com"),
				new Trader(5, "Terry5", "London5", "5@gmail.com")
				);
	}
}
