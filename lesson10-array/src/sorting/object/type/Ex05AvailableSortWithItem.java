package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] items = getItems();

		// Arrays.sort(X[]) --> X must be implemented Comparable<X>

		// 1. Sorting item DESC by storeId
		Arrays.sort(items);
//		Arrays.sort(items, new Comparator<Item>() {
//			@Override
//			public int compare(Item i1, Item i2) {
//				return i1.getId() - i2.getId();
//			}
//		});

		// 2. Sorting item storeId(asc), price(desc)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1.getStoreId() == i2.getStoreId())
					return Double.compare(i2.getPrice(), i1.getPrice());
				return i1.getStoreId() - i2.getStoreId();
			}

		});
		ArrayUtils.printf("2. Sorting item storeId(ASC), price(DESC)", items);

		// 3. Sorting item name(asc) & null_last
		items[0] = null;
		items[2] = null;
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1 == null)
					return 1;
				if (i2 == null)
					return -1;
				return i1.getName().compareTo(i2.getName());
			}
		});
		ArrayUtils.printf("3. Sorting item name(ASC) null last", items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 101),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 620, 102), };
	}
}
