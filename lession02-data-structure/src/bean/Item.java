package bean;
// Class --> kiểu dữ liệu đối tượng
// chứa nhiều thông tin bên trong
// Mỗi thông tin mình gọi là một thuộc tính, đặc điểm của class này

public class Item {
	
	// thuộc tính, attributes
	public int id;
	public String name;
	public double price;
	
	//Empty constructor ---> hàm khởi tạo rỗng
	public Item() {
	}
	
	// this đại diện cho địa chỉ, ô nhớ hiện tại đang gọi, đang khởi tạo
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
	}
		
	// Hàm: access_modified[static] return_type function_name(parameters)
	// Hàm khởi tạo: [access_modified] function_name(parameter) --->function_name=class_name
	public Item(int pId, String pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;		
		
	}
@Override
public String toString() {
	return this.id + "," +this.name + "," + this.price;

}
}
