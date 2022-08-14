package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {

	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("Price:" + itemX.price);
		System.out.println("itemX1 hash: " + System.identityHashCode(itemX));
		modify(itemX);
		System.out.println("Price:" + itemX.price);
		
	}
	
	private static void modify(Item item) {
		System.out.println("item1 hash: " + System.identityHashCode(item));
		item.price = 888;
		item = new Item(202, "ItemY", 555);
		System.out.println("item2 hash: " + System.identityHashCode(item));
		item.price = 999;
		
	}
}
