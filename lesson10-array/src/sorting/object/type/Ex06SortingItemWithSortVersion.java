package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import common.Item;
import utils.ArraysUtils;

public class Ex06SortingItemWithSortVersion {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		Arrays.sort(items, Comparator.comparing(Item::getStoreID).thenComparing(Item::getPrice, Comparator.reverseOrder()));
		Arrays.sort(items, Comparator.nullsFirst(Comparator.comparing(Item::getStoreID).thenComparing(Item::getPrice, Comparator.reverseOrder())));
		ArraysUtils.printf("sorting : ", items);
		items[3] = null;
		items[0] = null;
		Arrays.sort(items, Comparator.nullsFirst(Comparator.comparing(Item::getStoreID)
				.thenComparing(Item::getPrice, Comparator.reverseOrder())));
		ArraysUtils.printf("null First : ", items);
		
		
	}
	public static Item[] getItems() {
		return new Item[] {
				
				new Item(2, "Siuu1", 10, 2),
				new Item(4, "Siuu2", 2000, 3),
				new Item(7, "Siuu3", 50, 3),
				new Item(1, "Siuu4", 600, 3),
				
				 
				 
		};
	}

}
