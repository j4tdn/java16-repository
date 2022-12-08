package model;

import java.util.Arrays;
import java.util.List;

import designpattern.strategy.Apple;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(new Apple("A1", "green", 200, "VietNam"),
				
				new Apple("A1", "red", 100, "thai"),
				new Apple("A2", "blue", 900, "cam"),
				new Apple("A3", "green", 50, "usa"),
				new Apple("B1", "black", 60, "cam ranh"),
				new Apple("B2", "white", 700, "VietNam")
				);
				
	}

}
