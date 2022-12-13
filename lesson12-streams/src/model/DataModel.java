package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transaction;

public class DataModel {
	private DataModel() {

	}
	
	public static Map<String, Integer> getBudget() {
		Map<String, Integer> budget = new HashMap<>();
		
		budget.put("task-a", 500);
		budget.put("task-b", 200);
		budget.put("task-c", 404);
		budget.put("task-d", 100);
		budget.put("task-e", 999);
		budget.put("task-g", 777);
		budget.put("task-k", 325);
		return budget;
	}
	
	public static List<Dish> getDishes() {
		return List.of(
				new Dish("1", "D01", 120, FoodCategory.FISH),
				new Dish("2", "D02", 360, FoodCategory.FISH),
				new Dish("3", "D03", 240, FoodCategory.FISH),
				new Dish("4", "D04", 880, FoodCategory.MEAT),
				new Dish("5", "D05", 970, FoodCategory.MEAT),
				new Dish("6", "D06", 650, FoodCategory.MEAT),
				new Dish("7", "D07", 10, FoodCategory.VEGGIE),
				new Dish("8", "D08", 30, FoodCategory.VEGGIE)	
				);
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
				new Apple("A10", "yellow", 200, "VietNam"));
	}

	public static List<Trader> getTraders() {
		return Arrays.asList(
				new Trader("Raoul", "Cambridge"), 
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"), 
				new Trader("Brian", "Cambridge"));
	}

	public static List<Transaction> getTransactions() {
		List<Trader> traders = getTraders();
		return Arrays.asList(
				new Transaction(traders.get(3), 2011, 300), 
				new Transaction(traders.get(0), 2012, 1000),
				new Transaction(traders.get(0), 2011, 400), 
				new Transaction(traders.get(1), 2012, 710),
				new Transaction(traders.get(1), 2012, 700),
				new Transaction(traders.get(2), 2012, 950));
	}
}
