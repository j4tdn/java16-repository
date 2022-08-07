package bean;

// Class --> Kieu du lieu doi tuong
// Chua nhieu thong tin ben trong
// Moi thong tin minh goi la 1 cai thuoc tinh, dac diem cua class nay
public class Item {
	
	//thuoc tinh(attributes)
	public int id;
	public String name;
	public double price;
	
	//Empty constructor --> Ham khoi tao rong
	public Item() {
		
	}
	
	// this: dai dien cho dien chi, o nho hien tai dang goi hay dang khoi tao
		public Item(int pId, String pName) {
			this.id = pId;
			this.name = pName;
		}
	
	// Ham: [access_modifier] [static] return_type function_name(parameters)
	// Ham khoi tao: [access_modifier]  function_name(parameters) -->function name = class_name
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
