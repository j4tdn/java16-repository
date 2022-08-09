package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {

	public static void main(String[] args) {
		Item itemX = new Item(55, "item55 ", 55.5);
		System.out.println("item1 hash: " + System.identityHashCode(itemX));
		System.out.println("itemX= " + itemX);
		modify(itemX);
		System.out.println("itemx= " + itemX.price);
	}
	private static void modify(Item itemX) {
		System.out.println("item1 hash: " + System.identityHashCode(itemX));
		itemX.price = 66.6;
		itemX = new Item(200, "item200 ", 20.2);
		System.out.println("item2 hash: " + System.identityHashCode(itemX));
		itemX.price = 99.9;
	}
}
