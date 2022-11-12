package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel() {
	}

	public static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Item 1", 350, 101));
		items.add(new Item(8, "Item 8", 120, 102));
		items.add(new Item(2, "Item 2", 450, 101));
		items.add(new Item(9, "Item 9", 250, 102));
		items.add(new Item(5, "Item 5", 620, 102));
		return items;
	}
}
