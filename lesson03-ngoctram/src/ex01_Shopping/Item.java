package ex01_Shopping;

public class Item {
//	+ Item : id, os, color, cost
	private String id;
	private String os;
	private String color;
	private double cost;
	
	public Item() {
		
	}

	public Item(String id, String os, String color, double cost) {
		this.id = id;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
