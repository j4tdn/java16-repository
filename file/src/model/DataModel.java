package model;

import java.util.List;

import bean.Trader;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Trader> getTraders(){
		return List.of(
				new Trader(1, "Terry", "London"),
				new Trader(2, "Kaka", "Brazil"),
				new Trader(3, "Adam", "London"));
	}

}
