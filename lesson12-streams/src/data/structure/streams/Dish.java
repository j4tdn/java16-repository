package data.structure.streams;

import java.util.Objects;

public class Dish {
	private String id;
	private String name;
	private int calories;
	private FoodCategory category; // type of dish
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}

	public Dish(String id, String name, int calories, FoodCategory category) {
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

//	@Override
//	public int hashCode() {
//		return Objects.hash(calories, category, id, name);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Dish other = (Dish) obj;
//		return calories == other.calories && category == other.category && Objects.equals(id, other.id)
//				&& Objects.equals(name, other.name);
//	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(calories);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		return calories == other.calories;
	}
	// use for c2 in Ex02FilterDistinctByKey:
	// menu.stream().distinct().forEach(System.out::println);
}
