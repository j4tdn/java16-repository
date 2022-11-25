package bean;

public class Item {
	private int itemId ;
	private String name;
	private double salePrice;
	private int storeId;
		
	public Item() {
	}
	public Item(int itemId, String name, double salePrice, int storeId) {
		super();
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


	public double getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(double salePrice) {
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
		return "itemId:" + itemId + ", name:" + name + ", salePrice:" + salePrice + ", storeId:" + storeId + "";
	}
	
	
}
