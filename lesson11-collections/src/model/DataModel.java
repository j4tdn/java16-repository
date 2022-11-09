package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static Item[] getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Item1", 350, 101));
		items.add(new Item(5, "Item2", 320, 501));
		items.add(new Item(6, "Item3", 300, 301));
		
		return items;
	}
}
