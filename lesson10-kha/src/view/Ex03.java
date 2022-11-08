package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		List<Item> items = getItem();
		items.sort(Comparator.comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, Comparator.reverseOrder()));
		int id = items.get(0).getStoreId();
		System.out.println(items.get(0));
		for (Item item : items) {
			if(id != item.getStoreId()) {
				System.out.println(item);
				id = item.getStoreId();
			}
				
		}
	}
	
	
	
	private static List<Item> getItem() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "A", 25, 101));
		items.add(new Item(2, "B", 90, 102));
		items.add(new Item(3, "C", 88, 102));
		items.add(new Item(4, "D", 40, 101));
		items.add(new Item(5, "E", 60, 102));
		items.add(new Item(6, "F", 18, 101));
		
		return items;
	}
}
