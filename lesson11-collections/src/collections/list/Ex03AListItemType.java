package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();

		Item itemToBeRemoved = new Item(8, "Item 8", 120, 101);
		items.remove(itemToBeRemoved);
		printf("items", items);
		// contains, remove

		// removeIf --> xóa items có id > 5
		items.removeIf(s -> s.getId() > 5);
		printf("items", items);

	}

	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " --> {");
		for (Item item : items) {
			System.out.println(item + ",");

		}
		System.out.println("}");
	}
}
