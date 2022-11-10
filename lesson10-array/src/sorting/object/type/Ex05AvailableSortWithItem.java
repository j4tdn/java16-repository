package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] item = getItems();
		
		//Array.sort(x[]) -> x implements Comparable<X> ==> x1.compareTo(x2)
		
		//1. sort item descending  with StoreId
		Arrays.sort(item);
		ArrayUtils.printf("1. Sort item descending  by StoreId", item);
		
		//comparator
		//2. sort item StoreId(asc), price(desc)
		Arrays.sort(item, new Comparator<>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1.getStoreId() > i2.getStoreId()) {
					return 1;
				}
				if(i1.getStoreId() < i2.getStoreId()) {
					return -1;
				}
				return Double.compare(i2.getPrice(), i1.getPrice());
				
			}
		});
		ArrayUtils.printf("2. Sort item StoreId(asc), price(desc)", item);
		
		item[0] = null;
		item[4] = null;
		//3. sort item name(asc) && null last
				Arrays.sort(item, new Comparator<>() {

					@Override
					public int compare(Item i1, Item i2) {
						if(i1 == null && i2 != null) {
							return 1;
						}
						if(i2 == null) {
							return -1;
						}
						return i1.getName().compareTo(i2.getName());
						
					}
				});
				ArrayUtils.printf("3. Sort item name(asc) && null last", item);
				
		
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 102),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 230, 102), new Item(5, "Item 5", 620, 102),
	};

	}

}
