package bean;

public class Item {
	private int itemID;
	private String name;
	private double salePrice;
	private int storeID;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int itemID, String name, double salePrice, int storeID) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.salePrice = salePrice;
		this.storeID = storeID;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
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
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	@Override
	public String toString() {
		return itemID + "," + name +"," + salePrice + "," + storeID +
				"\n";
	}
	


}
