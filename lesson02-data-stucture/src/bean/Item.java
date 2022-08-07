package bean;

// Class --> Kiểu data object
// Contains informations bên trong
// Mỗi thông tin gọi là một thuộc tính, đặc điểm của class này
public class Item {

	// thuộc tính: attributes
	public int id;
	public String name;
	public double price;

	// this: là đại diện cho cái địa chỉ,ô nhớ hiện tại,đang gọi, đang khởi tạo
	public Item(int pId, String pName) {
		id = pId;
		name = pName;

	}

	// empty constructor: hàm khởi tạo rỗng
	public Item() {

	}

	// Hàm [access_modifier] [static] return_type fucntion_name(parameters)
	// Hàm khởi tạo: [access_modifier] function_name(parameters) -->function_name = class_name
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


