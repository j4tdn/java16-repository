package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import designpartterns.strategy.Apple;
import bean.Transaction;
import bean.Warehouse;
import data.structure.stream.Dish;
import data.structure.stream.FoodCategogy;
import bean.Trade;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Warehouse> getWhs(){
		return List.of(
				new Warehouse(11, "WH-11", 1, List.of(1,2,3,4,5)),
				new Warehouse(12, "WH-12", 1, List.of(6,7,8,9,10)),
				new Warehouse(21, "WH-21", 2, List.of(11,12,13,14,15)),
				new Warehouse(22, "WH-22", 2, List.of(16,17,18,19,20))
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
				new Apple("B4", "yellow", 500d, "Lao"));
	}
	
	
	public static List<Trade> getTraders(){
		return Arrays.asList(
				new Trade("Raoul", "Cambridge"),
		        new Trade("Mario", "Milan"),
		        new Trade("Alan", "Cambridge"),
		        new Trade("Brian", "Cambridge"));
	}
	
	public static List<Transaction> getTransactions(){
		Trade raoul = new Trade("Raoul", "Cambridge");
        Trade mario = new Trade("Mario", "Milan");
        Trade alan = new Trade("Alan", "Cambridge");
        Trade brian = new Trade("Brian", "Cambridge");
		
		return Arrays.asList(
				new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
	}
	
	public static List<Dish> GetDishes(){
		return List.of(
				new Dish("1", "D01", 120, FoodCategogy.FISH), 
				new Dish("2", "D02", 360, FoodCategogy.FISH), 
				new Dish("3", "D03", 880, FoodCategogy.FISH), 
				new Dish("4", "D04", 880, FoodCategogy.MEAT), 
				new Dish("5", "D05", 970, FoodCategogy.MEAT), 
				new Dish("6", "D06", 650, FoodCategogy.MEAT), 
				new Dish("7", "D07", 30, FoodCategogy.VEGGIE), 
				new Dish("8", "D08", 30, FoodCategogy.VEGGIE)
			);
	}
	
	public static Map<String, Integer> getMap(){
		Map<String, Integer> mapp = new HashMap<String, Integer>();
		mapp.put("task - a", 100);
		mapp.put("task - b", 20);
		mapp.put("task - c", 500);
		mapp.put("task - d", 10);
		mapp.put("task - e", 284);
		mapp.put("task - f", 999);
		mapp.put("task - g", 50);
		mapp.put("task - h", 101);
		
		return mapp;
	}
	
}
