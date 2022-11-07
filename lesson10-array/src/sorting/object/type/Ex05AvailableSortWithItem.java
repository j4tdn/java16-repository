package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		// Arrays.sort(X[] --> X implements Comparable<X>
		// support for one sort
		// default: if(this.compare(that) > 0 ) --> swap
		
         //1. Sorting item descending by storeId
		Arrays.sort(items);
		ArrayUtils.printf("1. Sorting item descending by storeId", items);
		
		// Comparator
		//2. Sorting item storeID(asc), price(desc)
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
		ArrayUtils.printf("2. Sorting item storeID(asc), price(desc)", items);
		
		items[0] = null;
		items[4] = null;
		//3. Sorting item name(asc), null last
				Arrays.sort(items, new Comparator<Item>() {

					@Override
					public int compare(Item i1, Item i2) {
						if (i1 == null && i2 != null) {
							return 1;
						}
						if (i2 == null) {
							return -1;
						}
						return i1.getName().compareTo(i2.getName());	
					}
					
					
				});
				ArrayUtils.printf("Sorting item name(asc), null last", items);
	}

	private static Item[] getItems() {
		return new Item[] {new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 540, 102),
				new Item(2, "Item 2", 690, 101), new Item(5, "Item 5", 220, 102), new Item(9, "Item 9", 160, 102) };
	}
}
