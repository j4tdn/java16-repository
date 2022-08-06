package datastructure;

import bean.Item;

public class Ex08Filnal {

	public static void main(String[] args) {
		final int a = 20;
		int b = 40;
//		a = 40;
//cannot reassign value at STACK
		final Item itemA = new Item(111, "ItemA", 111);
		Item itemB = new Item(222, "ItemB", 222);
//		itemA = itemB;
		itemA.name="Update Item";
		System.out.println("item: "+itemA);
		itemB.name="Update Item";
		System.out.println("item: "+itemB);
	}

}
