package bean;

public class Item {
	
	public Item(int pId, String pName, int pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
	}
//empty constructor
	public Item() {
		
	}
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
	//thuoc tinh, attributes
	public int id;
	public String name;
	public double price;
}
