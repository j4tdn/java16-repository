package bean;

public class Item {
	int itemId;
	String name;
	double salesPrice;
	int storeId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String name, double salesPrice, int storeId) {
		super();
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
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ "]";
	}
	
	
}
