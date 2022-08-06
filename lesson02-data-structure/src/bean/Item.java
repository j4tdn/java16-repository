package bean;

// Class --> kiểu dữ liệu đối tượng
// Chứa nhiều thông tin bên trong
// Mỗi thông tin mình gọi là 1 thuộc tính, đặc điểm của class này
public class Item {
	//thuộc tính, attributes
	public int itemId;
	public String name;
	public double price;
	
	
	// this : Đại điện cho địa chỉ , ô nhớ hiện tại đang gọi, đang khởi tạo
	public Item() {
		super();
	}

	public Item(int itemId, String name) {
		super();
		this.itemId = itemId;
		this.name = name;
	}


	public Item(int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
