package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// khai báo KDL nguyên thủy
		// number, itemA: biến , tham chiếu --> luôn nằm ở STACK
		// Giá trị của KNT --> STACK
		int number = 10;
		
		// khai báo KDL đối tượng ==> default: NULL
		// Item: id, name, price
		// Giá trị lưu trữ ở HEAP
		// new Item() --> gọi hàm khởi tạo
		// Tạo ra một ô nhớ ở HEAP với các thuộc tính, đặc điểm của class này
		Item itemA = new Item();
		
		itemA.itemId = 101;
		itemA.name = "Item 101";
		itemA.price = 220;
		
		System.out.println("item id: "+ itemA.itemId);
		System.out.println("item name: "+ itemA.name);
		System.out.println("item price: "+ itemA.price);
		
		System.out.println("=====================================");
		
		Item itemB = new Item(7, "Item 7");
		
		System.out.println("item id: "+ itemB.itemId);
		System.out.println("item name: "+ itemB.name);
		System.out.println("item price: "+ itemB.price);
		
		System.out.println("=====================================");
		
		Item itemC = new Item(5, "Item 50", 440);
		
		System.out.println("item id: "+ itemC.itemId);
		System.out.println("item name: "+ itemC.name);
		System.out.println("item price: "+ itemC.price);
		
		System.out.println("=====================================");
		
		Item itemD = new Item(7, "Item 7");
		// Mặc định khi in ra biến kiểu đối tượng --> tự động gọi hàm toString() của class Object
		// Vì class Object là class cha của mọi class trong JAVA
		System.out.println("itemC : "+ itemC);
		System.out.println("itemD : "+ itemD);
		
		
	}
}
