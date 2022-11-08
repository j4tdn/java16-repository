package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items  = getItems();
		
		maxPriceFromStoreID(items);
	}
	
	private static  void maxPriceFromStoreID(Item[] items) {
		
		Arrays.sort(items, Comparator.comparing(Item::getStoreID).thenComparing(Item::getSalePrice, Comparator.reverseOrder()));
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
				new Item(3, "C2", 26, 103),
				new Item(4, "C", 745, 165),
				new Item(5, "C1", 232, 107),
				new Item(6, "C2", 100, 108),
				new Item(7, "C3", 212, 162),
				new Item(8, "C4", 2121, 102),
				new Item(9, "D", 40, 101),
				new Item(10, "E", 60, 102),
				new Item(11, "F", 18, 103),
				
				 
				 
		};
	}

}
