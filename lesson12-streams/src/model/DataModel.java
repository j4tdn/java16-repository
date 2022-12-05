package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;

public class DataModel {
private DataModel() {
	
}
public static List<Apple> getApples() {
	return Arrays.asList(
			new Apple("A1", "green", 200, "VietNam"),
			new Apple("A2", "red", 400, "Lao"),
			new Apple("A3", "blue", 600, "Thailand"),
			new Apple("A4", "green", 800, "VietNam"),
			new Apple("A5", "red", 100, "VietNam"),
			new Apple("A6", "yellow", 200, "VietNam"),
			new Apple("A7", "green", 200, "VietNam"),
			new Apple("A8", "red", 500, "Lao"),
			new Apple("A9", "blue", 100, "Thailand"),
			new Apple("A10", "yellow", 200, "VietNam")
			);
}
}
