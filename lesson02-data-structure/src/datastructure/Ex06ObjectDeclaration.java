package datastructure;

import bean.Item;
//chỉ import type khi khác package

public class Ex06ObjectDeclaration {

	public static void main(String[] args) {
		// khai báo KDL nguyên thủy
		int number = 10;

		// khai báo kiểu dữ liệu đối tượng ==> default value : NULL

		// new Item() --> gọi hàm khởi tạo của class Item
		// Tạo ra một cái ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 220000);
		System.out.println("itemA id:" + itemA.id);
		System.out.println("itemA name:" + itemA.name);
		System.out.println("itemA price:" + itemA.price);

		Item itemB = new Item(7, "Item 7");

		System.out.println("itemB id:" + itemB.id);
		System.out.println("itemB name:" + itemB.name);

		Item itemC = new Item(55, "Item 55", 550000);
		System.out.println("itemC id:" + itemC.id);
		System.out.println("itemC name:" + itemC.name);
		System.out.println("itemC price:" + itemC.price);

		// Mặc định khi in ra biến kiểu đối tượng --> tự dộng gọi hàm toString của class
		// Object
		// Vì Object mặc định là class cha của mọi class trong java
		System.out.println("itemC:" + itemC.toString());
		System.out.println("itemA:" + itemA);

	}
}