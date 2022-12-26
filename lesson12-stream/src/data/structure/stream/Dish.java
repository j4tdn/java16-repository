package data.structure.stream;

public class Dish {
	private String id;
	private String name;
	private int calories;
	private FoodCategogy category;
	

	public Dish() {
	}

	public Dish(String id, String name, int calories, FoodCategogy category) {
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

	public FoodCategogy getCategory() {
		return category;
	}

	public void setCategory(FoodCategogy category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + calories + ", " + category;
	}
	
	
	
	
}
