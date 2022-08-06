package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {

	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("price1 " + itemX.price);
		modify(itemX);
		System.out.println("price2 "+itemX.price);
	}
//	JAVA pass by VALUE at STACK
//	Toán tử = luôn hoạt động ở STACK, gán phải cho trái
//	Item item = itemX
	private static void modify(Item item) {
		item.price = 888;
		item = new Item(202, "Item Y", 555);
		item.price = 999;
	}

}
