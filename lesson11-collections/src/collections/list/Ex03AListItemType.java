package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();
		
		// Item itemToBeRemoved = new Item(99, "Item 99", 200, 101);
		Item itemToBeRemoved = new Item(8, "Item8", 120, 102);
		items.remove(itemToBeRemoved);
		// contains, remove
		
		// remove if --> xoá items có id > 5
		items.removeIf(item -> item.getId() > 5);
		printf("items", items);	
	}
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " --> {");
		for (Item item: items) {
			System.out.println(item + ", ");
		}
		System.out.println("}");
	}
}
