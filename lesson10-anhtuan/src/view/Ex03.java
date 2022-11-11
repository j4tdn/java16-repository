package view;

import java.util.Arrays;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		Item[] id101 = storeId(items, 101);
		System.out.println(Arrays.toString(id101));
		Item[] id102 = storeId(items, 102);
		System.out.println(Arrays.toString(id102));
		System.out.println("max storeId101: " + Arrays.toString(maxPrice(id101)));
		System.out.println("max storeId102: " + Arrays.toString(maxPrice(id102)));
		
	}
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101)
				
		};
	}
	private static Item[] storeId(Item[] items, int id) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item i: items) {
			if(i.getStoreID() == id) {
				result[count++] = i;
			}
		}
		return Arrays.copyOfRange(result,  0, count++);
	}
	private static Item[] maxPrice(Item[] items) {
		Item[] result = new Item[1];
		double max = items[0].getSalePrice();
		for(int i = 0; i < items.length; i++) {
			if (max <= items[i].getSalePrice()) {
				result[0] = items[i];
			}
			
	            
		}
		return result;
	}

}
