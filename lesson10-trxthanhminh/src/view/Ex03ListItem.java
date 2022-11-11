package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ArrayUtils;
import bean.Item;

public class Ex03ListItem {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if (i1.getStoreId() > i2.getStoreId()) {
					return 1;
				}
				if (i1.getStoreId() < i2.getStoreId()) {
					return -1;
				}
				return Double.compare(i2.getSalesPrice(), i1.getSalesPrice());
			}
			
		});
		
		ArrayUtils.printf("Item", items);
		
		Item[] id1 = storeId(items, 101);
		System.out.println("max salePrice of storeId 101: " + id1[0]);
		
		Item[] id2 = storeId(items, 102);
		System.out.println("max salePrice of storeId 101: " + id2[0]);
	}
	
	private static Item[] storeId(Item[] items, int storeId) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item i: items) {
			if(i.getStoreId() == storeId) {
				result[count++] = i;
			}
		}
		return Arrays.copyOfRange(result,  0, count++);
	}
	private static Item[] getItems() {
		return new Item[] { 
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "f", 18, 101)

		};
	
	}
}
