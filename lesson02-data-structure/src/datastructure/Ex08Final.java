package datastructure;

import bean.Item;

public class Ex08Final {

	public static void main(String[] args) {
		// Khong the gan lai gia tri thong qua toan tu =
		// Cannot ressign value at stack
		final int a = 20;
		//a = 40;
		
		final Item itemA = new Item(111, "ItemA", 111);
		Item itemB = new Item(222, "ItemB", 222);
		//itemA = itemB;
		itemA.name = "Update Item";
		System.out.println("item" +itemA );
	}

}
