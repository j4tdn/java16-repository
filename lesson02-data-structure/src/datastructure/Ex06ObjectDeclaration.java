package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {

	public static void main(String[] args) {
		// khai baó kiểu nguyên thủy
		// number và itemA: biến hoặt tham chiếu -> luôn nằm ở stack
		// giá trị kiểu NT stack
		int number = 10;
		// khai báo kiểu đối tượng -> 
		//Item: id, name, price 
		// giá trị kiểu DT heap
		Item itemA = new Item(100, "khanh", 220);

		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		System.out.println("========================================");
		
		Item itemC = new Item(55, "item55", 440);

		System.out.println("item id: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);
		
		System.out.println("========================================");
		
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("item id: " + itemB.id);
		System.out.println("item name: " + itemB.name);
		
		System.out.println("========================================");
		
		Item itemD = new Item(5, "Item5");
		
//		System.out.println("item id: " + itemD.id);
//		System.out.println("item name: " + itemD.name);
		System.out.println("item name: " + itemD);
	}

}
