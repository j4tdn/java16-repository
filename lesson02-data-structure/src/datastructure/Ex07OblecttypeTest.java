package datastructure;

import bean.Item;

public class Ex07OblecttypeTest {

	public static void main(String[] args) {
		Item itemX = new Item(101, "Item ", 200);
		System.out.println("itemX1 hash: " + System.identityHashCode(itemX));

		modify(itemX);
		System.out.println("price: " + itemX.price);
	}
	//JAVA pass by VALUE ar STACK
	//toán tử = luôn hoạt động ở STACK, gán phải cho trái
	//Item item = itemX;
	private static void modify(Item item) {
		System.out.println("item1 hash: " + System.identityHashCode(item));
		item.price = 888;
		item = new Item(202, "Item Y", 555);
		System.out.println("item2 hash: " + System.identityHashCode(item));
		item.price = 999;
	}

}
