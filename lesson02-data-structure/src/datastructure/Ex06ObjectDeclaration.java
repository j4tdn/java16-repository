package datastructure;

// Chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// Khai baso KDL nguyên thuỷ
		// number itemA: biến, tham chiếu -- luôn nằm ở STACK
		// Giá trị của KNT --> STACK
		int number = 10;
		
		// Khai báo KDL đối tượng => default: NULL
		// Item: id, name, price
		// giá trị lưu trữ ở HEAP
		// Item itemA = 1, "Item 1", 100;
		// new Item() --> gọi hàm khởi tạo của class Item
		// Tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		System.out.println("===================");
		
		// itemC: id=55, name="Item 55", price=440
		Item itemC = new Item(55, "Item 55", 440);
		System.out.println("item id: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);
		
		System.out.println("===================");
		
		// itemB: id = 7, name="Item 7"	
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item7";
		
		System.out.println("item id: " + itemB.id);
		System.out.println("item name: " + itemB.name);

	
	System.out.println("===================");
	Item itemD = new Item(33, "Item 33");
	
	//System.out.println("item id: " + itemD.id);
	//System.out.println("item name: " + itemD.name);
	// Mặc định khi in ra biến kiểu đối tượng --> tự động gọi hàm toString của class Object
	// Vì Object là class cha của mọi class trong JAVA
	System.out.println("itemD: " + itemD);
	System.out.println("itemC: " + itemC);
	//System.out.println("itemD: " + itemD.toString());
	
	}
}
