package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("itemX hash" + System.identityHashCode(itemX));
		System.out.println("price: "+itemX.price);
		
		modify(itemX);
		System.out.println("price: "+itemX.price);
	}
	
	//java pass by value at stack
	// toán tử = gán phải cho trái giá trị ở stack
	private static void modify(Item item) {
		System.out.println("item1 hash" + System.identityHashCode(item));
		item.price=888;
		item=new Item(202,"Item Y",555);
		System.out.println("item2 hash" + System.identityHashCode(item));
		item.price=999;
	}
}
