package datastructure;
import bean.Item;
public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		Item item = new Item(101, "ItemA", 200);
		System.out.println("price : " + item.price);
		System.out.println("ItemX hash : " + System.identityHashCode(item));
		modify(item);
		System.out.println("price : " + item.price);
		
	}
	private static void modify(Item item) {
		item.price = 888;
		System.out.println("ItemY hash : " + System.identityHashCode(item));
		item = new Item(202, "Item Y", 555);
		System.out.println("ItemY hash : " + System.identityHashCode(item));
		item.price = 999;
	}
}
