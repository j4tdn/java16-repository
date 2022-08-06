package bean;

// Class --> Kieu du lieu doi tuong chua nhieu thong tin ben trong
// Moi thong tin minh goi la mot thuoc tinh, dac diem cua class nay
public class Item {
	
	// thuoc tinh, attributes
	public int id;
	public String name;
	public double price;
	
	// parameter: tham so
	// Ham: [access_modifier] [static] return_type function_name(parameters)
	// Ham khoi tao: [access_modifier] function_name(parameters) --> function_name = class_name
	// empty constructor
	public Item() {
		
	}
	
	// this: dai dien cho dia chi, o nho hien tai dang goi, dang khoi tao
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
		
	}
	public Item(int pId, String pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}
