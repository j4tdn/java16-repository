package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Trader;
import bean.Transaction;
import bean.Warehouse;
import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;

public class DataModel {
	private DataModel() {

	}
	
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple(1, "green", 200, "Vietnam"),	
				new Apple(16, "green", 300, "Vietnam"),	
				new Apple(22, "red", 300, "Lao"),	
				new Apple(4, "yellow", 400, "Thailand"),	
				new Apple(17, "red", 600, "Vietnam"),	
				new Apple(6, "green", 100, "Thailand")	
		);
	}

	public static Map<String, Integer> getBudget() {
		Map<String, Integer> budget = new HashMap<>();
		budget.put("task-a", 500);
		budget.put("task-b", 200);
		budget.put("task-c", 700);
		budget.put("task-d", 400);
		budget.put("task-e", 100);
		budget.put("task-g", 150);
		budget.put("task-k", 920);
		return budget;
	}

	public static List<Dish> getDishes() {
		return List.of(new Dish("1", "D01", 120, FoodCategory.FISH), new Dish("2", "D02", 360, FoodCategory.MEAT),
				new Dish("3", "D03", 650, FoodCategory.FISH), new Dish("4", "D04", 880, FoodCategory.VEGGIE),
				new Dish("5", "D05", 970, FoodCategory.VEGGIE), new Dish("6", "D06", 650, FoodCategory.MEAT),
				new Dish("7", "D07", 50, FoodCategory.FISH), new Dish("8", "D08", 50, FoodCategory.FISH));
	}

	public static List<Warehouse> getWhs() {
		return List.of(new Warehouse(11, "WH-11", 1, List.of(1, 2, 3, 4, 5, 8, 9, 33, 44)),
				new Warehouse(12, "WH-12", 1, List.of(6, 7, 8, 9, 10)),
				new Warehouse(21, "WH-21", 2, List.of(11, 12, 13, 14, 15)),
				new Warehouse(24, "WH-24", 2, List.of(16, 17, 18, 19, 20)),
				new Warehouse(21, "WH-22", 2, List.of(21, 22, 23)));
	}
	
	public static List<Trader> getTraders() {
		List<Trader> traders = new ArrayList<>();
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);
		
		return traders;
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
}
