package common;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	private double price;
	private int getStoreId;
	
	public Item() {
	}

	public Item(int id, String name, double price, int getStoreId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.getStoreId = getStoreId;
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

	public int getGetStoreId() {
		return getStoreId;
	}

	public void setGetStoreId(int getStoreId) {
		this.getStoreId = getStoreId;
	}
	//this: pre
	//o : next
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		return i2.getStoreId - i1.getStoreId;
	}

	@Override
	public String toString() {
		return id + "," + name +"," + price + "," + getStoreId ;
	}
	

}
