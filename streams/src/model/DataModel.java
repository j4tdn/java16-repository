package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodType;
import designpatterns.strategy.Apple;
import predemo.Trader;
import predemo.Transacions;

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
		budget.put("task-g", 900);
		budget.put("task-k", 325);

		return budget;

	}

	public static List<Dish> getDishes() {
		return List.of(new Dish("1", "D01", 120, FoodType.FISH), new Dish("2", "D02", 360, FoodType.FISH),
				new Dish("3", "D03", 240, FoodType.MEAT), new Dish("4", "D04", 880, FoodType.MEAT),
				new Dish("5", "D05", 970, FoodType.MEAT), new Dish("6", "D06", 650, FoodType.MEAT),
				new Dish("7", "D07", 10, FoodType.VEGETA), new Dish("8", "D08", 30, FoodType.VEGETA));
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

	public static List<Transacions> getTransaction() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transacions> transactions = Arrays.asList(
				new Transacions(brian, 2011, 300),
				new Transacions(raoul, 2012, 1000),
				new Transacions(raoul, 2011, 400),
				new Transacions(mario, 2012, 710),
				new Transacions(mario, 2012, 700),
				new Transacions(alan, 2012, 950));
		return transactions;
	}

	public static List<Apple> getApples() {
		return Arrays.asList(new Apple("a1", "red", 200, "viet nam"), new Apple("a2", "green", 300, "mi"),
				new Apple("a3", "green", 400, "viet nam"), new Apple("a4", "yello", 500, "capuchia"),
				new Apple("a5", "red", 600, "han"));
	}

}
