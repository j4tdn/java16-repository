package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpattern.strategy.Apple;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<String, Integer> getBudget(){
		Map<String, Integer> map = new HashMap<>();
		map.put("task - a", 100);
		map.put("task - c", 200);
		map.put("task - d", 600);
		map.put("task - k", 900);
		map.put("task - u", 500);
		map.put("task - j", 200);
		map.put("task - v", 300);
		
		return map;
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(new Apple("A1", "green", 200, "VietNam"),
				
				new Apple("A1", "red", 100, "thai"),
				new Apple("A2", "blue", 900, "cam"),
				new Apple("A3", "green", 50, "usa"),
				new Apple("B1", "black", 60, "cam ranh"),
				new Apple("B2", "white", 700, "VietNam")
				);
				
	}
	
	
	public static List<Dish> getDishs(){
		return List.of(
				new Dish("1", "Hamberger", 300, FoodCategory.MEAT),
				new Dish("2", "Hamberger1", 200, FoodCategory.FISH),
				new Dish("3", "Banh Xeo", 100, FoodCategory.MEAT),
				new Dish("4", "BunTHITNuong", 150, FoodCategory.FISH),
				new Dish("5", "BanhCanh", 300, FoodCategory.MEAT),
				new Dish("6", "BunRieu", 200, FoodCategory.MEAT),
				new Dish("7", "RAU MUONG", 50, FoodCategory.RAU),
				new Dish("8", "ThitCho", 200, FoodCategory.FISH),
				new Dish("9", "Hamberger2", 500, FoodCategory.RAU));
	}
 
}
