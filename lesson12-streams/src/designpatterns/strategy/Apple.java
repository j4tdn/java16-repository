package designpatterns.strategy;

import java.util.Objects;

public class Apple {
	private String id;
	private String color;
	private double weight;
	private String original;
	
	public Apple() {
		System.out.println("Apple Constructor 01");
	}
	
	public Apple(String id) {
		this.id = id;
	}

	public Apple(String id, String color, double weight, String original) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.original = original;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Apple)) {
			return false;
		}
		Apple that = (Apple)o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", original=" + original + "]";
	}
}
