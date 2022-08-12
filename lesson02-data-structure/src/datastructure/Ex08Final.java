package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		// KNT - KDT
		// cannot reassign value at stack
		final int a = 20;
		System.out.println(a);
		//a = 40;
		
		final Item itemA = new Item(111, "Item A", 111);
		Item itemB = new Item(222, "Item B", 222);
		itemB.id = 111;
		//itemA = itemB;
		itemA.name = "Update Item";
		System.out.println("item: " + itemA);
	}

}
