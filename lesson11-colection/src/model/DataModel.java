package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel() {
		
	}
	public static List<Item> getItem() {
		List<Item> item = new ArrayList<Item>();
		
		item.add(new Item(1,"Item 1", 350, 101));
		item.add(new Item(8,"Item 2", 120, 102));
		item.add(new Item(2,"Item 3", 450, 101));
		item.add(new Item(9,"Item 4", 250, 102));
		item.add(new Item(5,"Item 5", 620, 102));
		return item;
		
	}

}
