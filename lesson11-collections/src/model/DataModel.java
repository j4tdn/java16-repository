package model;

import java.util.ArrayList;
import java.util.List;

import common.Item;

public class DataModel {
	private DataModel() {
	}

	public static List<Item> getItem() {
		List<Item> tmp = new ArrayList<Item>();
		tmp.add(new Item(1, "Item1", 350, 101));
		tmp.add(new Item(2, "Item2", 450, 101));
		tmp.add(new Item(9, "Item9", 250, 102));
		tmp.add(new Item(5, "Item5", 620, 102));
		return tmp;
	}
}
