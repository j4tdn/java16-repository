package bean;

public class Item {
	private int id;
	private String name;
	private String os;
	private String color;
	private int cost;
	
	public Item(int id, String name, String os, String color, int cost) {
		this.id = id;
		this.name = name;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
