package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {

	public static void main(String[] args) {
		Item[] items = getItem();
		// 1. Sorting items descending with storeId
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null) return -1;
				else if (o2 == null) return 1;
				else return o2.getStoreId() - o1.getStoreId();
			}
		});
		System.out.println("1. Sorting items descending with storeId");
		ArrayUtils.printf("items", items);
		System.out.println();
		System.out.println("2. Sorting items ascending storeId & descending price");
		// 2. Sorting items ascending storeId & descending price
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null) return 1;
				else if (o2 == null) return -1;
				else {
					if(o1.getStoreId() > o2.getStoreId())
						return 1;
					else if (o1.getStoreId() == o2.getStoreId()) {
						return Double.compare(o2.getPrice(), o1.getPrice());
					}
					else return -1;
				}
			}
		});
		ArrayUtils.printf("items", items);

	}
	
	public static Item[] getItem() {
		return new Item[] {
				null,
				new Item(1, "Item1", 350, 101),
				new Item(8, "Item8", 120, 102),
				new Item(2, "Item2", 450, 101),
				null,
				new Item(9, "Item9", 250, 102),
				new Item(5, "Item5", 620, 102),
				null
		};
	}

}
