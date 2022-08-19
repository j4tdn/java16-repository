package bean;
// Class --> Kiểu dữ liệu đối tượng
//Chứa nhiều thông tin bên trong
//Mỗi thông tin mình gọi là 1 thuộc tính, đặc điểm của class này
public class Item {	
	// thuộc tính, attributes
	public int id;
	public String name;
	public double price;
	// hàm khởi tạo rỗng --> Empty constructor
	// this : đại diện cho địa chỉ, ô nhớ hiện tại đang gọi, đang khởi tạo
	public Item() {
		
	}
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
		
	}
	//Hàm: [access_modifier] [static]  return_type function_name(parameters)
	// Hàm khởi tạo: [access_modifier] function_name(parameters) --> function_name = calss_name
	public Item(int pId, String pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	@Override
	public String toString() {
		return this.id + " , " + this.name + " , " + this.price;
	}
}
