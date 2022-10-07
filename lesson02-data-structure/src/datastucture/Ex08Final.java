package datastucture;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		// KNT - KDT
		// Bien(KNT, KDT) thi minh khong the gan lai gia tri thong qua toan tu
		// cannot reassign value at stack
		final int a = 20;
		int b = 40;
		// a = 40; fail
		final Item itemA = new Item(111, "Item A", 111);
		Item itemB = new Item(222, "Item B", 222);
		// itemA = itemB; fail
		itemA.name = "Updated Item";
		System.out.println("Id: " + itemA.itemId + ", Name: " + itemA.name + ", Price: " + itemA.price);
	}
}
