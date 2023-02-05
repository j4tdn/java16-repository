package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodCatelogy;
import designpatterns.strategy.Apple;

public class Datamodel {
	private Datamodel() {
	}
	
	public static Map<String, Integer> getBudget() {
		Map<String, Integer> budget = new HashMap<>();
		budget.put("task-a", 500);
		budget.put("task-b", 400);
		budget.put("task-c", 320);
		budget.put("task-d", 520);
		budget.put("task-e", 520);
		budget.put("task-f", 500);
		budget.put("task-g", 500);
		budget.put("task-h", 500);
		return budget;
	}
	
	public static List<Dish> getDishes() {
		return List.of(
					new Dish("1", "D01", 120, FoodCatelogy.FISH),
					new Dish("2", "D02", 360, FoodCatelogy.FISH),
					new Dish("3", "D03", 880, FoodCatelogy.FISH),
					new Dish("4", "D04", 880, FoodCatelogy.MEAT),
					new Dish("5", "D05", 970, FoodCatelogy.MEAT),
					new Dish("6", "D06", 650, FoodCatelogy.MEAT),
					new Dish("7", "D07", 30, FoodCatelogy.VEGGIE),
					new Dish("8", "D08", 30, FoodCatelogy.VEGGIE)
				);
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
