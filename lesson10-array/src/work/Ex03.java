package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import common.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items  = getItems();
		
		maxPriceFromStoreID(items);
	}
	
	private static  void maxPriceFromStoreID(Item[] items) {
		
		Arrays.sort(items, Comparator.comparing(Item::getStoreID).thenComparing(Item::getPrice, Comparator.reverseOrder()));
		System.out.println(items[0]);
		List<Item> list = new ArrayList<>();
		int id = items[0].getStoreID();
		for (Item item : items) {
			if(item.getStoreID() != id) {
				id = item.getStoreID();
				System.out.println(item );
			}
		}
	}
	
	
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 26, 103),
				new Item(25, "C", 745, 1065),
				new Item(53, "C1", 232, 107),
				new Item(35, "C2", 100, 108),
				new Item(53, "C3", 212, 1065),
				new Item(37, "C4", 2121, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 103),
				
				 
				 
		};
	}

}
