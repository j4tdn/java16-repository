package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;


import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {

	public static void main(String[] args) {
		Item[] items = getItem();
		// 1. Sort items by itemId(ASC)
		
		//Arrays.sort(items, Comparator.comparing(o -> o.getName()));
		//ArrayUtils.printf("1. Sort items by itemId(ASC)", items);
		System.out.println();
		// 2. Sort items storeId(asc), price(asc)
		Arrays.sort(items, Comparator.nullsFirst(Comparator.comparing(Item::getName, Comparator.reverseOrder()).thenComparing(Item::getPrice)));
		ArrayUtils.printf("1. Sort items by itemId(ASC)", items);

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
