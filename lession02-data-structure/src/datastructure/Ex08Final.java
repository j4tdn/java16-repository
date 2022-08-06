package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] arges) {
		//KNT - KDT
		//Biến(KNT,KĐT) thì mình không thể gán lại giá trị thông qua toán tử =
		final int a =20;
		int b =40;
		//a = 40;
		
		final Item itemA= new Item(111, "Item A", 111);
		Item itemB= new Item(222, "Item B", 222);
		// itemA = itemB;
		itemA.name = "Updated Item";
		System.out.println("item: " +itemA);
	}

}
