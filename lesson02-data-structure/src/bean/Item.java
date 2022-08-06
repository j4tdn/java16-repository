package bean;

// Class --> Kiểu dữ liệu đối tượng//
// Chứa nhiều thông tin bên trong
// Mỗi thông tin mình gọi là một thuộc tính, đặc điểm của class này
public class Item {
	
	// thuộc tính, attribute
	public int id;
	public String name;
	public double price;
	
	// Hàm khởi tạo rỗng
	public Item() {
		
	}
	
	// this: đại diện cho địa chỉ, ô nhớ hiện tại đang gọi, khởi tạo 
	public Item(int pId, String pName){
		this.id = pId;
		this.name  = pName;
	}
	
	public Item(int pId, String pName, double pPrice){
		id = pId;
		name  = pName;
		price = pPrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price ;
	}
	
}
		
	
    
