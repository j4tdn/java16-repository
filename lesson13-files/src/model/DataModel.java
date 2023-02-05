package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	private DataModel() {
	}

	public static List<Trader> getTraders() {
		// [id], name, address
		return List.of(
				new Trader(1, "Terry", "London", "0t@gamil.com"), 
				new Trader(2, "Kaka", "Brazil", "2k@gamil.com"),
				new Trader(3, "Adam", "Milan", "4a@gamil.com"));
	}
}
