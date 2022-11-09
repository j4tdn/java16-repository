package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {

	private DataModel() {

	}

	public static List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();

		items.add(new Item(1, "Item 1", 350, 101));
		items.add(new Item(3, "Item 3", 220, 102));
		items.add(new Item(2, "Item 2", 120, 101));
		items.add(new Item(4, "Item 4", 230, 102));
		items.add(new Item(7, "Item 7", 310, 101));
		return items;
	}
}
