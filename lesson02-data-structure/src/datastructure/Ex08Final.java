package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		//KNT - KDT
		//Bien (KNT-KDT) thi minh khong the gan lai gia tri thong qua toan tu =
		// canot reassign value at stack
		final int a = 20;
		int b = 40;
		
		final Item itemA = new Item(111,"Item A" , 111);
		Item itemB = new Item(222,"Item B" , 222);
		//itemA = itemB;
		itemA.name = "Updated Item";
		System.out.println("item: " + itemA);
	}
	
}
