package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList( 
			new Apple("A1", "green", 200, "VietNam"),
			new Apple("A2", "red", 300, "ThaiLan"),
			new Apple("A3", "blue", 400, "Lao"),
			new Apple("A4", "green", 500, "Brunei"),
			new Apple("B1", "red", 700, "VietNam"),
			new Apple("B2", "yellow", 600, "VietNam")
			
		);
	}
}
