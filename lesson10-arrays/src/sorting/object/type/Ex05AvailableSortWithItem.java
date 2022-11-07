package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		// Item: itemId, name, price, storeId
		Item[] items = getItems();
		
		// ----> Comparable(support for one sort function)
		// Arrays.sort(X[]) --> X implements Comparable<X>
		// default: if(this.compareTo(
		
		// 1. Sorting item descending by storeId
		Arrays.sort(items);
		ArrayUtils.printf("1. Sorting item descending by storeId", items);
		
		items[0] = null;
		items[4] = null;
		// Comparator
		// 2. Sorting item storeId(asc), price(desc)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1 == null && i2 != null) {
					return 1;
				}
				// sure -- s1(!null)
				if (i2 == null) {
					return -1;
				}
				
				if (i1.getStoreId() > i2.getStoreId()) {
					return 1;
				}
				if (i1.getStoreId() < i2.getStoreId()) {
					return -1;
				}
				
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
			
		});
		ArrayUtils.printf("2. Sorting item ", items);
		
		// 3. Sorting item name(asc), null last
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1 == null && i2 != null) {
					return 1;
				}
				// sure -- s1(!null)
				if (i2 == null) {
					return -1;
				}
				
				return i1.getName().compareTo(i2.getName());
			}
			
		});
		ArrayUtils.printf("3. Sorting item ", items);
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
