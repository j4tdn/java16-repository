package datastructure;

// chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// Khai báo KDL nguyên thủy
		// number : biến , tham chiếu
		// giá trị của KNT --> STACK

		int number = 10;

		// Khai báo KDL đối tượng ==> default: NULL
		// Item: id , name , price
		// Item itemA = 1 , "item 1",100;
		// new Item() --> gọi hàm khởi tạo của class Item
		// Tạo ra ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101 ", 220);

		System.out.println("item id : " + itemA.id);
		System.out.println("item name : " + itemA.name);
		System.out.println("item price : " + itemA.price);

		System.out.println("=============================");

		Item itemC = new Item(55, "Item 55 ", 440);

		System.out.println("item id : " + itemC.id);
		System.out.println("item name : " + itemC.name);
		System.out.println("item price : " + itemC.price);

		System.out.println("=============================");

		Item itemB = new Item();

		itemB.id = 7;
		itemB.name = "Item 7";

		System.out.println("item id : " + itemB.id);
		System.out.println("item name : " + itemB.name);

	}
}
