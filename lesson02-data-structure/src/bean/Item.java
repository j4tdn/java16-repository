package bean;

//Class --> Kieu du lieu doi tuong
//Chua nhieu thong tin ben trong
//Moi thong tin minh goi la mot thuoc tinh, dac diem cua class nay
public class Item {
	public int itemId;
	public String name;
	public double price;

	// Ham khoi tao rong
	public Item() {
	}

	// Ham: [access_modifier] [static] return_type function_name(parameters)
	// Ham khoi tao: [access_modifier] function_name(parameters)
	public Item(int id, String name, double price) {
		this.itemId = id;
		this.name = name;
		this.price = price;
	}

	// this: dai dien cho dia chi, o nho hien tai dang goi, dang khoi tao
	public Item(int id, String name) {
		this.itemId = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + this.itemId + ", name: " + this.name + ", price: " + this.price;
	}
}
