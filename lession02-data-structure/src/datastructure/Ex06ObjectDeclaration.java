package datastructure;

// chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// Khai báo kiểu dữ liệu nguyên thuỷ
		// number: biến/ tham chiếu --> Luôn nằm ở STACK
		// Giá trị của Kiểu nguyên thuỷ --> STACK
		int number = 10;
		
		// Khai báo KDL đối tượng ==> default: NULL
		// Item: id, name, price
		// Giá trị lưu trữ ở HEAP
		// new Item() --> Gọi hàm khởi tạo của class Item
		// Tạo ra 1 ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "item101");
		
		
		System.out.println("itemA id: " + itemA.id);
		System.out.println("itemA name: " + itemA.name);
		System.out.println("itemA price: " + itemA.price);
		
		System.out.println("================");
		
		//itemC: id=55, name="item55", price=440
		Item itemC = new Item(55, "item 55", 440);
		
		System.out.println("itemC id: " + itemC.id);
		System.out.println("itemC name: " + itemC.name);
		System.out.println("itemC price: " + itemC.price);
		
		System.out.println("================");
		
		//itemB: id=7, name="item 7"
		
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("itemB id: " + itemB.id);
		System.out.println("itemB name: " + itemB.name);
		System.out.println("itemB price: " + itemB.price);
		
		// itemD
		
Item itemD = new Item();
		
		itemD.id = 33;
		itemD.name = "Item 33";
		
		// System.out.println("itemB id: " + itemB.id);
		// System.out.println("itemB name: " + itemB.name);
		// Mặc định khi in ra biến kiểu đối tượng --> Tự động gọi hàm toString của class Object 
		// Vì Object mặc định là class cha của mọi class trong JAVA
		System.out.println("itemD: " + itemD);
		System.out.println("itemC: " + itemC);
		//System.out.println("itemD: " + itemD.toString());
		
		
	}

}
