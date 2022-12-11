package designpartterns.strategy;

import java.util.Objects;

public class Apple {
	private String id;
	private String color;
	private Double weight;
	private String original;
	
	public Apple() {
		
	}

	public Apple(String id, String color, Double weight, String original) {
		super();
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

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return id + ", " + color + ", " + weight + ", " + original;
	}
	
	
	
	
	
}
