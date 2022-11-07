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
		
		// Problem: override Comparable#compareTo(that) --> verbose
		//			override Comparator#compare(c1, c2) --> verbose
		
		Item[] items = getItems();
		
		// 1. SORT items by name(ASC)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		// lamda
		Arrays.sort(items, 
				(i1,i2) -> i1.getName().compareTo(i2.getName())
		);
			
		// T - Item
		// R - String(Name)
		// 
		// item -> item.getName() ==> Item::getName(method reference)
		Arrays.sort(items,
				Comparator.comparing(Item::getName));
		
		
		ArrayUtils.printf("items by name(ASC)"	, items);
		
		// 4. storeId(asc), price(desc)
		Arrays.sort(items,
				Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice, Comparator.reverseOrder()));
		ArrayUtils.printf("items by 4. storeId(asc), price(desc)"	, items);
		
		items[0] = null;
		items[4] = null;
		// 5. storeId(asc), price(desc), null first , items
		Arrays.sort(items,
				Comparator.nullsFirst(
						Comparator.comparing(Item::getStoreId).
						thenComparing(Item::getPrice, Comparator.reverseOrder())));
		ArrayUtils.printf("items by 5. storeId(asc), price(desc), null first , items"	, items);
	}	
	
	public static Item[] getItems() {
		return new Item[] {
			new Item(1, "Item1", 350, 101),
			new Item(8, "Item8", 120, 102),	
			new Item(2, "Item2", 450, 101),	
			new Item(9, "Item9", 250, 102),	
			new Item(5, "Item5", 620, 102),	
		};
	}
}
