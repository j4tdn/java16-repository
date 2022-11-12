package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex06AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//1. Sorting item descending by storeId
		Arrays.sort(items);
		ArrayUtils.printf("1. Sorting item descending by storeId", items);
	
		// 2. Sorting item storeId(asc), price(desc)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1.getSortId() > i2.getSortId()) {
					return 1;

				}
				if(i1.getSortId() < i2.getSortId()) {
					return -1;
				}
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
			// 4 storeId(asc), price(desc)
			Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getPrice, reverseOrder())));
			ArraysUtils.printf("4", items);
			
			items[0] = null;
			items[4] = null;
			//5
			Arrays.sort(items, nullsLast(comparing(Item::getStoreId).thenComparing(Item::getPrice, reverseOrder())));
			ArrayUtils.printf("5", items);
		});
		
		
	
	}
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "Item 1", 350, 101),
				new Item(3, "Item 2", 351, 102),
				new Item(4, "Item 3", 353, 101),
				new Item(2, "Item 4", 352, 102),
				new Item(5, "Item 5", 354, 102),

		};
	}
}
