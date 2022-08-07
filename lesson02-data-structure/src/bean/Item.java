package bean;

//Class: kiểu dữ liệu đối tượng
//chứa nhiều thông tin bên trong
//Mỗi thông tin gọi là một cái thuộc tính
public class Item {
	// thuộc tính : attributes
	public int id;
	public String name;
	public double price;
	//empty constructor: hàm khởi tạo rỗng
	public Item() {
		
	}
	
	//Hàm access_modifier[static] return_type_function_name(parameters)
	//hàm khởi tạo: [access_modifier] function_name(parameters)
	public Item(int sId, String sName, double sPrice) {
		id = sId;
		name = sName;
		price = sPrice;
		
	}
	public Item(int pId, String pName) {
		this.id = pId;
		this.name = pName;
	}
	@Override
	public String toString() {
		return this.id + "," + this.name +"," +this.price;
	}
}
