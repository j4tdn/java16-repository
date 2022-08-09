package bean;

// class là 1 kiểu dữ liệu đối tượng
// chứa nhiều thông tin bên trong
// mỗi thông tin mình gọi là 1 thuộc tính, đặc điểm của class này
public class Item {
	public int id;
	public String name;
	public double price;
	
	public Item() {
		
	}
	
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
		return this.id + "," + this.name + "," + this.price;
	}

}
