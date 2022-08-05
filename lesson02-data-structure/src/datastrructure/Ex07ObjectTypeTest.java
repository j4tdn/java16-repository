package datastrructure;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("itemX hash: "+ System.identityHashCode(itemX));
		System.out.println("price: "+ itemX.price);
		
		modify(itemX);
		System.out.println("price: "+itemX.price);
	}
   private static void modify(Item item) {
	   item.price = 888;
	   item =new Item(202,"Item Y",555);
	   System.out.println("item2 hash: "+ System.identityHashCode(item));
	   item.price = 999;
   }
}
