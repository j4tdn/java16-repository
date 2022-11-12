package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import java.util.Arrays;
import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		highestPriceOfStore(items);
	}

	public static void highestPriceOfStore(Item[] items) {
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));
		System.out.println("Item have highest price of the store " + items[0].getStoreId() + " is item: " + items[0]);
		int storeId = items[0].getStoreId();
		for (Item item : items) {
			if (item.getStoreId() != storeId) {
				storeId = item.getStoreId();
				System.out.println("Item have highest price of the store " + storeId + " is item: " + item);
			}
		}
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "A", 25, 101), new Item(2, "B", 90, 102), new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), new Item(5, "E", 60, 102), new Item(6, "F", 18, 101) };
	}
}
