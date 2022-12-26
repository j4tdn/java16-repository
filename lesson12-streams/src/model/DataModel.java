package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Warehouse;
import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transaction;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Warehouse> getWhs() {
		return List.of(
				new Warehouse(11, "WH-11", 1, List.of(1, 2, 3, 4 ,5)),
				new Warehouse(12, "WH-12", 1, List.of(6, 7, 8, 9 ,10)),
				new Warehouse(21, "WH-13", 2, List.of(11, 12, 13, 14, 15)),
				new Warehouse(22, "WH-14", 2, List.of(16, 17, 18, 19, 20))
		);
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
			new Dish("3", "D03", 880, FoodCategory.FISH),
			new Dish("4", "D04", 880, FoodCategory.MEAT),
			new Dish("5", "D05", 970, FoodCategory.MEAT),
			new Dish("6", "D06", 650, FoodCategory.MEAT),
			new Dish("7", "D07", 30, FoodCategory.VEGGIE),
			new Dish("8", "D08", 30, FoodCategory.VEGGIE)
			
		);
	}
	
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple("A1", "green", 200, "VietNam"),
				new Apple("A2", "red", 400, "Laos"),
				new Apple("A3", "blue", 600, "ThaiLand"),
				new Apple("A4", "green", 200, "Brunei"),
				new Apple("B1", "red", 800, "VietNam"),
				new Apple("B2", "yellow", 100, "VietNam"),
				new Apple("B3", "green", 700, "VietNam"),
				new Apple("B4", "yellow", 500, "Laos")
		);
				
	}
	
	public static List<Trader> getTrader() {
		return Arrays.asList(
				new Trader("Tan", "Cambridge"),
				new Trader("Nhung", "Milan"),
				new Trader("Nhan", "Cambridge"),
				new Trader("Phat", "Cambridge")
		);
	}
	
	public static List<Transaction> getTransaction() {
		List<Trader> traders = getTrader();
		
		return Arrays.asList(
				new Transaction(traders.get(0), 2011, 300),
				new Transaction(traders.get(1), 2012, 1000),
				new Transaction(traders.get(2), 2011, 400),
				new Transaction(traders.get(3), 2012, 710),
				new Transaction(traders.get(0), 2012, 750),
				new Transaction(traders.get(1), 2012, 950)
		);
	}
}
