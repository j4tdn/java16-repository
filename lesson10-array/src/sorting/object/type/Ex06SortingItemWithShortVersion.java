package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Arrays.sort(primitive)
		// Arrays.sort(String/Integer/... -> subclass of Comparable)
		// Arrays.sort(Item[], Comparator<Item>)
		
		// Problem: override Comparable # compareTo(that) -> verbose
		//					 Comparable # compare(c1, c2) -> verbose
		
		Item[] items = getItem();
		// 1. Sort items by itemName(asc)
		
		// C1: Comparator normal
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getId();
			}
			
		});
		ArrayUtils.printf("Sorting items by name(asc)\n", items);
		
		// C2: Lambda
		Arrays.sort(items, (i1, i2) -> i1.getName().compareTo(i2.getName()));
		ArrayUtils.printf("Sorting items by name(asc)\n", items);
		
		// C3: Comparing
		Arrays.sort(items, Comparator.comparing(Item::getName));
		ArrayUtils.printf("Sorting items by name(asc)\n", items);
		
		
		// 2. storeId(asc), price(desc)
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice).reversed());
		ArrayUtils.printf("Sorting items by storeId(asc), price(desc)\n", items); // false expectation
		
		
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice, reverseOrder()));
		ArrayUtils.printf("Sorting items by storeId(asc), price(dessc)\n", items); // TRUE
		
		items[2] = null;
		// 3. nullsfirst/nullslast, storedId(asc), price(desc)
		Arrays.sort(items, nullsLast(comparing(Item::getStoreId).
				thenComparing(Item::getPrice, reverseOrder())));
		ArrayUtils.printf("Sorting items by storeId(asc), price(dessc)\n", items);
	}
	
	public static Item[] getItem() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 150, 101),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 650, 102), };
	}
}
