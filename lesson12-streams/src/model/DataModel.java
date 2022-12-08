package model;

import java.util.Arrays;
import java.util.List;

import designparterns.strategy.Apple;

public class DataModel {
	private DataModel() {
	}

	public static List<Apple> getApples() {
		return Arrays.asList(new Apple("A1", "green", 200, "VietNam"), new Apple("A2", "red", 400, "Lao"),
				new Apple("A3", "blue", 600, "ThaiLand"), new Apple("A4", "green", 200, "Brunei"),
				new Apple("B1", "red", 800, "VietNam"), new Apple("B2", "yellow", 100, "VietNam"),
				new Apple("B3", "green", 700, "VietNam"), new Apple("B4", "yellow", 500, "Lao")

		);
	}

}
