package view;
import java.util.Arrays;
import static java.util.Comparator.*;
import bean.Item;

public class Ex03StoreManager {
	public static void main(String[] args) {
		Item[] items = getItems();		
		maxPriceItem(items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "A", 25, 101), new Item(2, "B", 90, 102), new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), new Item(5, "E", 60, 102), new Item(6, "F", 18, 101)
		};
	}

	private static void maxPriceItem(Item[] items) {
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrice,reverseOrder()));
		System.out.println("Mat hang co gia ban cao nhat cua cua hang " + items[0].getStoreId() + " " + items[0]);
		int storeId = items[0].getStoreId();
		for(Item item : items) {
			if(item.getStoreId() != storeId) {
				storeId = item.getStoreId();
				System.out.println("Mat hang co gia ban cao nhat cua cua hang " + storeId + " " +item);
			}
		}
	}
}