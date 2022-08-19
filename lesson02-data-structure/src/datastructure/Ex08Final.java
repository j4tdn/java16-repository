package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		//KNT - KDT
		//biến(KNT - KDT) thì mình không thể gán lại giá trị thông
		//qua toán tử = 
		//cannot reassign value at stack
		
		
		final int a = 20;
		int b = 40;
		//a = 40;
		
		Item itemA = new Item(111,"Item A",111);
		Item itemB = new Item(222,"Item B",222);
		//itemA=itemB;
		itemA.name = "Update Item";
		System.out.println("item" + itemA);
	}
}
