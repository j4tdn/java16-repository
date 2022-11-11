package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import javax.sound.sampled.ReverbType;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Arrays.sort(primitive)
		// rrays.sort(String/Integer/Item) --> sub class of Comparable
		// Arrays.sort(Item[], Comparator<Item>)
		
		// Problem: override Comparable#compareTo(that) --> verbose
		//			override Comparator#compare(c1, c2) --> verbose
		
		Item[] items = getItems();
		//4. storeId(asc), price(desc)
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing((Item::getPrice));
		ArrayUtils.printf("4. storeId(asc), price(desc): ", items);
		
		items[0] = null;
		items[4] = null;
		//5. storeID(asc), price(desc), null first
		Arrays.sort(items, Comparator.nullsFirst(Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice)));
	}
	
	public static Item[] getItems() {
		return new Item[] {
			new	Item(1, "Item 1", 350, 101),
			new Item(8, "Item 8", 120, 102),
			new Item(2, "Item 2", 450, 101),
			new Item(9, "Item 9", 250, 102),
			new Item(5, "Item 5", 620, 102),
				
		};
	}
}
