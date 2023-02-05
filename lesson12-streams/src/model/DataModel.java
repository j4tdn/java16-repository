package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpatterns.strategy.Apple;

public class DataModel {

	private DataModel()
	{
		
	}
	public static Map<String, Integer> getBudget()
	{
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
	public static List<Dish> getDishes()
	{
		return List.of(
				new Dish("1", "D01", 120, FoodCategory.FISH),
				new Dish("2", "D02", 720, FoodCategory.FISH),
				new Dish("3", "D03", 320, FoodCategory.FISH),
				new Dish("4", "D04", 120, FoodCategory.MEAT),
				new Dish("5", "D05", 220, FoodCategory.MEAT),
				new Dish("6", "D06", 620, FoodCategory.MEAT),
				new Dish("7", "D07", 520, FoodCategory.VEGGIE),
				new Dish("8", "D08", 320, FoodCategory.VEGGIE),
				new Dish("9", "D09", 220, FoodCategory.VEGGIE)
				);
	}
	public static List<Apple> getApples()
	{
		return Arrays.asList(
				new Apple("A1", "green", 200, "VietNam"),
				new Apple("A2", "red", 400, "Lao"),
				new Apple("A3", "blue", 600, "ThaiLand"),
				new Apple("A4", "green", 200, "Brunei"),
				new Apple("B1", "red", 800, "VietNam"),
				new Apple("B2", "yellow", 100, "VietNam"),
				new Apple("B3", "red", 700, "Campuchia"),
				new Apple("B4", "yellow", 100, "VietNam")
				
				);
	}
}
