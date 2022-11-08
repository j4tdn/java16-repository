package common;

public class Item {
	private int id;
	private String name;
	private double price;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, double price, int storeID) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeID = storeID;
	}
	private int storeID;
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
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		return this.compareTo(that);
	}
	
	@Override
	public String toString() {
		return "Item id=" + id + ", name=" + name + ", price=" + price + ", storeID=" + storeID + "\n";
	}

}
