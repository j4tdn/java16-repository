package datastructure;
import bean.Item;
public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
//		Item itemA = new Item(101, "Item A", 200);
//		System.out.println(itemA.price);
//		modify(itemA);
//		System.out.println("itemA.price: " + itemA.price);
		
		final Item itemA = new Item(101, "Item A", 200);
		itemA.name = "updated itemA";
		System.out.println(itemA);
	}
//	
//	private static void modify(Item item) {
//		item.price = 888;
//		item = new Item(202, "Item Y", 555);
//		item.price = 999;
//		System.out.println("item.price: " + item.price);
//	}
}
