package datastucture;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("price: " + itemX.price);
		System.out.println("item1 hash: " + System.identityHashCode(itemX));
		modify(itemX);
		System.out.println("price: " + itemX.price);
	}

	// JAVA pass by VALUE at STACK
	// Toan tu = luon hoat dong o STACK, gan phai cho trai
	// Item item = itemX;
	public static void modify(Item item) {
		System.out.println("item1 hash: " + System.identityHashCode(item));
		item.price = 888;
		item = new Item(202, "Item Y", 555);
		System.out.println("item1 hash: " + System.identityHashCode(item));
		item.price = 999;
	}
}
