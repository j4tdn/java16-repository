package datastructure;

import bean.Item;

public class Ex07Object2TypeTest {
	public static void main(String[] args) {
		Item itemX = new Item(101, "Item A", 200);
		System.out.println("itemX1 hash: " + System.identityHashCode(itemX));
		System.out.println("price: " + itemX.price);
		
		modify(itemX);
		System.out.println("price: " + itemX.price);
		
		
	}
	// JAVA PASS BBY VALUE at STACK 
	// Toán tử = luôn hoạt động ở STACK, gán phải cho trái 
	// Item item = itemX; 
	private static void modify(Item item) {
		System.out.println("itemX1 hash: " + System.identityHashCode(item));
		item.price = 888;
		item = new Item(202, "Item Y", 555);
		System.out.println("itemX2 hash: " + System.identityHashCode(item));
		item.price = 999;
		
	}
	
	
	
	
}
