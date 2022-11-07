package sorting.object.type;

import java.util.Arrays;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		//Arrays.sort(primitive)
		//Arrays.sort(String/Integer/ Item)--> sub class of Comparable
		// Arrays.sort(Item[], Comparator<Item>	
		
		
		//Problems: override Comparable#compareTo(that) --> verbose
		//          override Comparable#compareTo(that) --> verbose
		
		Item[] items = getItems();
		Arrays.sort(items,comparing(Item::getName));
		ArrayUtils.printf("last --> items by name(asc)",items);
		//4. storeId(asc), price(dsc)
		Arrays.sort(items,comparing(Item::getStoreId).thenComparing(Item::getPrice,reverse);
		ArrayUtils.printf("4. StoreId(asc)",items);
		
		
		
	}
		
		public static Item[] getItems() {
			return new Item[] { 
					new Item(1, "Item 1", 350, 101),
					new Item(8, "Item 8", 120, 102),
					new Item(2, "Item 2", 450, 101), 
					new Item(9, "Item 9", 230, 102), 
					new Item(5, "Item 5", 620, 102), 
			};

		
}
