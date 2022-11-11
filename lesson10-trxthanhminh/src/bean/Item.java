package bean;

public class Item implements Comparable<Item>{
	private int itemId;
	private String name;
	private double salesPrice;
	private int storeId;
	
	public Item() {
	}

	public Item(int itemId, String name, double salesPrice, int storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	@Override
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		return i1.compareTo(i2);
	}

	@Override
	public String toString() {
		return itemId + ", " + name + ", " + salesPrice + ", " + storeId + ", " + "\n";
	}
	
	
}
