package homework;

import java.util.Arrays;

import bean.Item;
import static java.util.Comparator.*;

public class Ex03FindItemPriceHighest {
	public static void main(String[] args) {

		Item[] items = getItems();
		find(items);
	}


	public static Item[] getItems() {
		return new Item[] { 
				new Item(1, "A", 25, 101), 
				new Item(2, "B", 90, 102), 
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), 
				new Item(5, "E", 60, 102), 
				new Item(6, "F", 18, 101)

		};

	}
	public static void find(Item[] items)
	{
		Arrays.sort(items,comparing(Item::getStoreId).thenComparing(Item::getSalesPrice,reverseOrder()));
		System.out.println("The store's highest selling item with id: " + items[0].getStoreId());
		System.out.println("-->" + items[0]);
		int idstore = items[0].getStoreId();
		for(Item item : items) {
			if(item.getStoreId() != idstore) {
				System.out.println("The store's highest selling item with id: " + item.getStoreId());
				System.out.println("-->" + item);
				break;
			}
		}
	
	}
}
