package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;

public class DataModel {

	private DataModel() {
		
	}
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple("A1", "green", 200, "VN"),
				new Apple("A2", "red", 201, "Lao"),
				new Apple("A3", "blue", 202, "TL"),
				new Apple("A4", "green", 203, "IDN"),
				new Apple("B1", "yellow", 204, "CPC"),
				new Apple("B2", "white", 205, "VN"),
				new Apple("B3", "red", 206, "Mls"),
				new Apple("B4", "green", 207, "VN"));
	}
}
