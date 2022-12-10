package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;

public class Datamodel {
	private Datamodel() {
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple("A1", "green", 200d, "VietNam"),
				new Apple("A2", "red", 400d, "Lao"),
				new Apple("A3", "blue", 600d, "Thailand"),
				new Apple("A4", "green", 200d, "Brunei"),
				new Apple("B1", "red", 800d, "VietNam"),
				new Apple("B2", "yellow", 100d, "VietNam"),
				new Apple("B3", "green", 700d, "VietNam"),
				new Apple("B4", "yellow", 500d, "Lao")
				);
	}
	
}
