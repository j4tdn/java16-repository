package bean;

// Class --> Kiểu dữ liệu đối tượng
// Chứa nhiều thông tin bên trong
// Mỗi thông tin gọi là một thuộc tính/ đặc điểm của class này
public class Item {
	//thuộc tính, attributes
	public int id;
	public String name;
	public double price;
	
	//Empty constructor --> Hàm khởi tạo rỗng
	public Item() {
	}
	// this: đại diện cho địa chỉ, ô nhớ hiện tại đang gọi/ khởi tạo
	public Item(int pID, String pName) {
		id = pID;
		name = pName;
	}
	// Hàm: [access_modifier] [static] return_type function_name(parameters)
	// Hàm khởi tạo: [access_modifier] function_name(parameters) --> function name = class name
	public Item(int pID, String pName, double pPrice) {
		id = pID;
		name = pName;
		price = pPrice;
	}
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}

}
