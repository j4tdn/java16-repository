package bean;

// Class --> Kiểu dữ liệu đối tượng
// Chứa nhiều thông tin bên trong
// Mỗi thông tin mình gọi là một thuộc tính, đặc điểm của class này
public class Item {
	
	// thuộc tính, attributes
	public int id;
	public String name;
	public double price;
	
	// Empty constructor --> Hàm khởi tạo rỗng
	public Item() {
		
	}
	
	// this: đại diện cho địa chỉ, ô nhớ hiện tại đang gọi, đang khởi tạo
	public Item(int pId, String pName) {
		this.id = pId;
		this.name = pName;
	}
	
	// parameter: tham số
	// Hàm: [access_modifier] [static] return_type function_name(parameters)
	// Hàm khởi tạo: [access_modifier] function_name(parameters) --> function_name = class_name
	// Item itemC = new Item(55, "Item 55", 440);
	// new Item(1, "Item 1", 222)
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
