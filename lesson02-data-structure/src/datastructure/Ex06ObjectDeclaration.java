package datastructure;

// Chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {

	public static void main(String[] args) {
		// Khai báo NT
		// Giá trị lưu ở STACK
		int number = 10;
		
		// Khai báo �?T --> NULL
		// Item: id, name, price
		// Giá trị lưu ở HEAP
		// new Item() --> g�?i hàm khởi tạo của class Item
		// Tạo ra một ô nhớ ở HEAP với các thuộc tính mang gt mặc định
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		Item itemB = new Item(7, "Item 7");
		
		System.out.println("=====================");
		
		System.out.println("item id: " + itemB.id);
		System.out.println("item name: " + itemB.name);		//System.out.println("item price: " + itemA.price);
		
		Item itemC = new Item(55, "Item 55", 440);
		
		System.out.println("=====================");
		
		System.out.println("item id: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);
		
		Item itemD = new Item(7, "Item 7");
		
		System.out.println("=====================");
		
		System.out.println("Item D: " + itemD);

	}

}
