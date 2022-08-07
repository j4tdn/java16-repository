package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		// KNT - KDT
		// Bien(KNT, KDT) thi minh khong the gan lai gia tri thong qua toan tu=
		// cannot ressign value at stack
		final int a = 20;
		int b = 40;
		// a =40;
		
		final Item itemA  = new Item(111, "Item A", 111);
		Item itemb = new Item(222, "Item B", 222);
		// itemA = itemB
		itemA.name = "Update itemA";
		System.out.println("item: " +itemA);
	}
}
