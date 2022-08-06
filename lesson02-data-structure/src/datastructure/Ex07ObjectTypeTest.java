package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("ItemX1 hash: " +System.identityHashCode(itemX));
		System.out.println("Price: " +itemX.price );
		
		modify(itemX);
		System.out.println("Price: " +itemX.price );
	}
	
	private static void modify(Item item) {
		System.out.println("Item1 hash: " +System.identityHashCode(item));
		item.price = 888;
		item = new Item(202, "Item Y", 555);
		System.out.println("Item2 hash: " +System.identityHashCode(item));
		item.price = 999;
			
	}

}
