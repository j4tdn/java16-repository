package common;

public class Item {
	private int id;
	private String name;
	private double price;
	private int sortId;
	
	public Item(int id, String name, double price, int sortId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.sortId = sortId;
	}
	public Item() {
		
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSortId() {
		return sortId;
	}
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		return i2.getSortId() - i1.getSortId();
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", sortId=" + sortId + "]";
	}
	
}
