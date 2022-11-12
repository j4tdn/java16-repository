package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Arrays.sort(primitive)
		// Arrays.sort(String/Integer/Item) --> sub class of Comparable
		// Arrays.sort(Item[], Comparator<Item>)

		// Problem: override Comparable#compareTo(that) --> Verbose
		// override Comparator#compare(Item i1, Item i2) --> Verbose
		Item[] items = getItems();

		// 1. SORT items by itemId(ASC)
		Arrays.sort(items, Comparator.comparing(Item::getName));
		ArrayUtils.printf("last --> items by name(ASC)", items);

		// 4. storeId(asc), price(desc)
		Arrays.sort(items,
				Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice, Comparator.reverseOrder()));
		ArrayUtils.printf("4. storeId(asc), price(asc)", items);

		// 5. storeId(asc), price(desc), null first
		items[0] = null;
		items[4] = null;
		Arrays.sort(items, Comparator.nullsLast(Comparator.comparing(Item::getStoreId)));
		ArrayUtils.printf("5. storeId(asc), price(desc), nulllast", items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 101),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 620, 102), };
	}
}
