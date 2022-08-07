package datastructure;

import bean.Item;

public class Ex08Final {
	//KNT vs KDT
	//Biến (KNT,KDT) thì mình không thể gán lại giá trị thông quan toán tử =
	//cannot reassign value at stack
	public static void main(String[] args) {
		final int a=20;
		//a=40;
		final Item itemA =new Item(111,"Item A",111);
		Item itemB = new Item(222,"Item B",222);
		//itemA=itemB;		
		itemA.name="Update item";
		System.out.println("item: "+itemA);
	}
}
