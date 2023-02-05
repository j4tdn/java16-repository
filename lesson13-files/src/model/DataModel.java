package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	public DataModel() {
	}

	public static List<Trader> getTraders() {
		//[id], name, address
		return List.of(new Trader(0, "Terry", "London"), new Trader(2, "KaKa", "Brasil"),
				new Trader(4, "Adam", "Milan"));
	}
}
