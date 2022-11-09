package common;

public class Item implements Comparable<Item>{

	private int id;
	private String name;
	private double price;
	private int storeId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double price, int storeId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
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

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + price + ", " + storeId + "\n";
	}

	@Override
	public int compareTo(Item that) {
		// TODO Auto-generated method stub
		Item i1 = this;
		Item i2 = that;
		
		return i2.getStoreId()-i1.getStoreId();
	}
	
}
