package sortting.oject.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		// Item: itemId, name, price, storeId
		Item[] items = getItems();

		// ----> Comparable(support for one sort function)
		// Arrays.sort(X[]) --> X implements Comparable<X> --> x1.compareTo(x2) ...
		// default: if(this.compareTo(that) > 0) --> swap

		// 1. Sorting item descending by storeId
		Arrays.sort(items);
		ArrayUtils.printf("1. Sorting item descending by storeId", items);

		// Comparator
		// 2. Sorting item storeId(asc), price(desc)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1.getStoreId() > i2.getStoreId()) {
					return 1;
				}
				if (i1.getStoreId() < i2.getStoreId()) {
					return -1;
				}
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
		ArrayUtils.printf("2. Sorting item storeId(asc), price(desc)", items);


		items[0] = null;
		items[4] = null;

		// 3. Sorting item name(asc) & null last
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1 == null && i2 != null) {
					return 1;
				}
				// i1 != null
				if (i2 == null ) {
					return -1;
				}
				return i1.getName().compareTo(i2.getName());
			}
		});
		ArrayUtils.printf("3. Sorting item name(asc) & null last", items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 102),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 620, 102), };
	}
}
