package collections.list;

import java.util.List;

import javax.xml.crypto.Data;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();

		Item itemToBeRemoved = new Item(8, "Item 8", 120.0, 102);
		items.remove(itemToBeRemoved);
		System.out.println("size: --> " + items.size());
		
		printf("items", items);
		// contains, remove
		
		// removeIf --> xoá items có id > 5
		items.removeIf(s-> s.getId() > 5);
		printf("item", items);
	}

	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " --> { ");
		for (Item item : items) {
			System.out.println(item + ", ");
		}
		System.out.println("}");
	}
}
