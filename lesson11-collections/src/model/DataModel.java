package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel(){
		
	
	}
	public static List<Item> getItem() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Item 1", 350, 101));
		items.add(new Item(8, "Item 8", 150, 101));
		items.add(new Item(2, "Item 2", 450, 101));
		items.add(new Item(9, "Item 9", 250, 102));
		items.add(new Item(5, "Item 5", 650, 102));
		return items;
	}
}
