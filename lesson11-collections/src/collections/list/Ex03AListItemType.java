package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items= DataModel.getItems();
		
		Item itemToBeRemoved = new Item(99,"Item 99",200, 101);
		
		items.remove(itemToBeRemoved);
		System.out.println("size " +items.size());
		printf("items", items);
		items.removeIf(item -> item.getId()>5);
		printf("items >5", items);
		
	}
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " ");
		for(Item item: items) {
			System.out.println(item);
		}
	}
	

}
