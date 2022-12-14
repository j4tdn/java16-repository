package bean;

public class ItemDetail {
	private int itemid;
	private int quantity;
	public ItemDetail(int itemid, int quantity) {
		super();
		this.itemid = itemid;
		this.quantity = quantity;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
