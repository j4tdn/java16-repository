package bean;

//Class --> kiểu dữ liệu đối tượng
//Chứa nhiều thông tin bên trong
//và mỗi thông tin gọi là một thuộc tính,đặc điểm của class(đối tượng) này
public class Item {
	// thuộc tính,attributes(biến toàn cục=thuộc tính,attributes)
	public int id;
	public String name;
	public double price;

	// Hàm bình thường --> [access modifier] [static] return_type
	// function_name(parameters)
	// Hàm khởi tạo --> [access modifier] function_name(parameters) -->function =
	// class_name
	public Item() {

	}

	// this là đại diện cho địa chỉ hay là ô nhớ hiện tại đang gọi/đang khởi tạo
	public Item(int pId, String pName) {
		id = pId;
		name = pName;
	}

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

