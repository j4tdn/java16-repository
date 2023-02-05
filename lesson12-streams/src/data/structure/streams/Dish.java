package data.structure.streams;

import java.util.Objects;

public class Dish {
	private String id;
	private String name;
	private int calories;
	private FoodCategory catelory;

	private void Dish() {
		// TODO Auto-generated method stub

	}

	public Dish(String id, String name, int calories, FoodCategory catelory) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.catelory = catelory;
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

	public FoodCategory getCatelory() {
		return catelory;
	}

	public void setCatelory(FoodCategory catelory) {
		this.catelory = catelory;
	}


	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", catelory=" + catelory + "]";
	}

}
