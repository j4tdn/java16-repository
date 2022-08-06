package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] arges) {
		Item itemX = new Item(101, "Item X", 200);
		System.out.println("item hash" + System.identityHashCode(itemX));
		System.out.println(" price " + itemX.price);
		
	modify(itemX);
	System.out.println("price " + itemX.price);
	
	}
	//java pass by value at STACK
	// Toán tử = luôn hoạt động ở STACK, gán phải cho trái 
	//Item item= item; //H3
    
	private static void modify(Item item) {
		System.out.println("item1 hash" + System.identityHashCode(item));
		item.price = 888;
		item =new Item(200, "Item Y", 555);
		System.out.println("item2 hash" + System.identityHashCode(item));
		item.price = 999;
	}
}
