package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Warehouse;
import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import designpatterns.strategy.*;
import live.demo.Trader;
import live.demo.Transaction;
public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	public static List<Warehouse> getWhs(){
		return List.of(
				new Warehouse(11, "WH-11", 1, List.of(1,2,3,4,5)),
				new Warehouse(12, "WH-12", 1, List.of(6,7,8,9,10)),
				new Warehouse(13, "WH-13", 2, List.of(11,12,13,14,15)),
				new Warehouse(14, "WH-14", 2, List.of(16,17,18,19,20))
				);
				
	}
	public static Map<String, Integer>getBudget() {
		Map<String, Integer> budget= new HashMap<>();
		budget.put("task-a", 500);
		budget.put("task-b", 400);
		budget.put("task-c", 300);
		budget.put("task-d", 200);
		budget.put("task-e", 299);
		budget.put("task-g", 999);
		budget.put("task-k", 768);
		
	return budget;
	}
	
	public static List<Dish> getDishes(){
		return List.of(//hàm của java11 trả về inmutable list
				new Dish("1","D01",120,FoodCategory.FISH),
				new Dish("2","D02",360,FoodCategory.FISH),
				new Dish("3","D03",880,FoodCategory.FISH),
				new Dish("4","D04",880,FoodCategory.MEAT),
				new Dish("5","D05",970,FoodCategory.MEAT),
				new Dish("6","D06",650,FoodCategory.MEAT),
				new Dish("7","D07",30,FoodCategory.VEGGIE),
				new Dish("8","D08",30,FoodCategory.VEGGIE));
	}
	public static List<Apple> getApples(){
		return Arrays.asList(new Apple("A1","green",200,"VietNam"),
				new Apple("A2","red",400,"Lao"),
				new Apple("A3","blue",600,"VietNam"),
				new Apple("A4","green",200,"VietNam"),
				new Apple("A5","red",800,"ThaiLan"),
				new Apple("A6","yellow",100,"VietNam"),
				new Apple("A7","green",700,"VietNam"),
				new Apple("A8","yellow",800,"VietNam")
				);
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