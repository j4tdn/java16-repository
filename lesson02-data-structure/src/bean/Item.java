package bean;

// class --> Kieu du lieu doi tuong
// chua nhieu thong tin ben trong
// moi thong tin minh goi la mot thuoc tinh , dac diem cua class nay
public class Item {

	// thuộc tính , attributes
	public int id;
	public String name;
	public double price;

	public Item() {

	}

	// ham: access_modifier [static] return_type function_name (parameters)

	// Ham khoi tao: [acess_modifier] function_name (parameters)
	public Item(int pId, String pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.price + " ";
	}

	public Item(int pId, String pName) {
		id = pId;
		name = pName;

	}
}
