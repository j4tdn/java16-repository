package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.function.Function;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Array.sort(primitive)
		// Array.sort(String/Integer/Item) --> sub class of Comparable
		// Array.sort(Item[], Comparator<Item>)
		
		//Problem: override Comparable#CompareTo(that)
		//         override Comparable#CompareTo(c1,c2)
		
		Item[] items = getItems();
		// 1. Sort Items asc by itemId(asc) -> i1.getId() - i2.getId()
		// 1. Sort Items asc by name(asc) --> i1.getName().compareTo(i2.getName())
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i1.getName().compareTo(i2.getName());
			}
			
		});
		// lambda
		Arrays.sort(items, 
				(i1,i2) -> i1.getName().compareTo(i2.getName()) );
		ArrayUtils.printf("Items asc by name", items);
		
		// T --> Items
		// R --> String
		// item -> item.getName() => Item::getName(mothod reference)
		Arrays.sort(items,comparing(Item::getName));
		ArrayUtils.printf("last --> items by name(ASC)", items);
		
		// 4. storeID(asc), price(desc)
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getPrice,reverseOrder()));
		ArrayUtils.printf("4. storeID(asc), price(desc)", items);
		
		// 4. storeID(asc), price(desc), null first
		items[0] = null;
		items[4] = null;
		Arrays.sort(items, nullsFirst(comparing(Item::getStoreId).thenComparing(Item::getPrice,reverseOrder())));
		ArrayUtils.printf("4. storeID(asc), price(desc), null first", items);
	}
	private static Item[] getItems() {
		return new Item[] {new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 540, 102),
				new Item(2, "Item 2", 690, 101), new Item(5, "Item 5", 220, 102), new Item(9, "Item 9", 160, 102) };
	}
}
