package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {

	public static void main(String[] args) {
		Item itemX = new Item(101, "Item A", 200);
		System.out.println("price: " + itemX.price);
		
		modify(itemX);
		System.out.println("price: " + itemX.price);
	}
	// JAVA pass by VALUE at STACK
	// Toán tử "=" luôn hoạt động ở STACK, gán bên phải cho bên trái
	// Item item = itemX
	private static void modify(Item item)
	{
		item.price = 888;// itemX.price = 888
		item = new Item(202, "Item Y", 555);// hàm khởi tạo tạo ô nhớ mới
		item.price = 999;
	}
}
