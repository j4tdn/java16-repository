package ex03;

public class Item {
	private int itemId;
	private String name;
	private int salePrice;
	private int storeId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String name, int salePrice, int storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salePrice = salePrice;
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

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [" + itemId + "," + name + "," + salePrice + "," + storeId + "]"+"\n";
	}
}
