package data.structure.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dish {

	private String id;
	private String name;
	private int calories;
	private FoodCategory category;
	
	
	public Dish() {
		
	}
	
	public static Map<String,Integer> getBudget(){
		Map<String, Integer> budget = new HashMap<>();
		
		budget.put("task-a", 500);
		budget.put("task-b", 400);
		budget.put("task-c", 200);
		budget.put("task-d", 560);
		budget.put("task-e", 333);
		budget.put("task-f", 134);
		budget.put("task-g", 660);
		return budget;
		
	}
	
	
public static List<Dish> getDishes() {
	return List.of(
			new Dish("1","D01",120,FoodCategory.FISH),
			new Dish("2","D02",360,FoodCategory.FISH),
			new Dish("3","D03",240,FoodCategory.FISH),
			new Dish("4","D04",880,FoodCategory.MEAT),
			new Dish("5","D05",970,FoodCategory.MEAT),
			new Dish("6","D06",650,FoodCategory.MEAT),
			new Dish("7","D07",10,FoodCategory.VEGGIE),
			new Dish("8","D08",30,FoodCategory.VEGGIE)
			);
}


	public Dish(String id, String name, int calories, FoodCategory category) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.category = category;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public FoodCategory getCategory() {
		return category;
	}


	public void setCategory(FoodCategory category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", category=" + category + "]";
	}
	
	
}
