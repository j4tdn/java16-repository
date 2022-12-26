package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpatterns.strategy.Apple;

public class DataModel {
	private DataModel() {
	}
	public static Map<String, Integer> getBudget(){
		Map<String, Integer> budget = new HashMap<>();
		
		budget.put("task-a", 500);
		budget.put("task-b", 200);
		budget.put("task-c", 404);
		budget.put("task-d", 100);
		budget.put("task-e", 999);
		budget.put("task-g", 900);
		budget.put("task-k", 325);
		
		
		
		return budget;
		
	}
	public static List<Dish> getDishes(){
		return List.of(
				new Dish("1", "D01", 120,FoodCategory.FISH),
				new Dish("2", "D02", 360,FoodCategory.FISH),
				new Dish("3", "D03", 240,FoodCategory.MEAT),
				new Dish("4", "D04", 880,FoodCategory.MEAT),
				new Dish("5", "D05", 970,FoodCategory.MEAT),
				new Dish("6", "D06", 650,FoodCategory.MEAT),
				new Dish("7", "D07", 10,FoodCategory.VEGGIE),
				new Dish("8", "D08", 30,FoodCategory.VEGGIE)
				);
	}
	public static List<Apple> getApples() {
		return Arrays.asList(
			new Apple("A1", "green", 200, "VietNam"),
			new Apple("A2", "red", 400, "Lao"),
			new Apple("A3", "blue", 600, "Thailand"),
			new Apple("A4", "green", 200, "Brunei"),
			new Apple("B1", "red", 800, "VietNam"),
			new Apple("B2", "yellow", 100, "VietNam"),
			new Apple("B3", "green", 700, "VietNam"),
			new Apple("B4", "yellow", 500, "Lao")
		);
	}
}