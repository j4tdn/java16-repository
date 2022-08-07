package bean;

// Class -> Kiểu dữ liệu đối tượng
// Chứa nhiều thông tin bên trong
// Mỗi thông tin được gọi là 1 thuộc tính của đối tượng
public class Item {
	public int id;
	public String name;
	public double price;
	
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
