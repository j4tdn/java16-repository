package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.WareHouse;
import designpattern.strategy.Apple;
import stream.Dish;
import stream.FoodCategory;

public class DataModel {
	private DataModel() {
		
	}
	public static List<WareHouse> getWhs(){
		return List.of(
				new WareHouse(11, "WH-11", 1, List.of(2,3,4,5)),
				new WareHouse(12, "WH-12", 1, List.of(6,7,8,9,10)),
				new WareHouse(21, "WH-21", 2, List.of(11,12,13,14,15)),
				new WareHouse(21, "WH-22", 2, List.of(16,17,18,19,20)));
	}
	public static Map<String, Integer> getBudget(){
		Map<String , Integer> budget = new HashMap<>();
		budget.put("task-a", 100);
		budget.put("task-b", 200);
		budget.put("task-c", 300);
		budget.put("task-d", 400);
		budget.put("task-e", 500);
		budget.put("task-g", 600);
		budget.put("task-k", 700);
		return budget;
	}
	public static List<Dish> getDish(){
		return Arrays.asList(
				new Dish("1", "D01", 120, FoodCategory.FISH),
				new Dish("2", "D02", 880, FoodCategory.FISH),
				new Dish("3", "D03", 880, FoodCategory.FISH),
				new Dish("4", "D04", 880, FoodCategory.MEAT),
				new Dish("5", "D05", 970, FoodCategory.MEAT),
				new Dish("6", "D06", 650, FoodCategory.MEAT),
				new Dish("7", "D07", 30, FoodCategory.VEGGIE),
				new Dish("8", "D08", 30, FoodCategory.VEGGIE));
	}
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple("A1", "green", 200, "VietNam"),
				new Apple("A2", "red", 400, "Lao"),
				new Apple("A3", "blue", 600, "ThaiLand"),
				new Apple("A4", "green", 200, "Brunei"),
				new Apple("B1", "red", 800, "VietNam"),
				new Apple("B2", "yellow", 100, "VietNam"),
				new Apple("B3", "green", 700, "VietNam"),
				new Apple("B4", "yellow", 500, "Lao")
				);
	}

}
