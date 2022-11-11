package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Item1", 20, 101));
		items.add(new Item(8, "Item8", 90, 102));
		items.add(new Item(2, "Item2", 88, 102));
		items.add(new Item(9, "Item9", 40, 101));
		items.add(new Item(5, "Item5", 60, 102));
		items.add(new Item(4, "Item4", 18, 101));
		return items;
	}
}
