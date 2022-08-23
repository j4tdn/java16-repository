package bean;

// Class --> Kiểu dữ liệu đối tượng 
// Chứa nhiều thông tin bên trong 
// Mỗi thông tin mình gọi là một cái thuộc tính, đặc điểm của class này 
public class Item {
	// thuộc tính, attributes;
	public int id;
	public String name;
	public double price;
	
	//Empty contructor--> hamf khoi tao rong
	public Item() {
		
	}
	//this dai dien cho dia chi
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
	}
	// Hàm: [access_modifier] [static] return_type fuction_name(prameters)
	// Hàm khởi tạo: [access_modifier] function_name(paremeter)-->function_name = class_name
	public Item(int pId, String pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.price;
	}
}
