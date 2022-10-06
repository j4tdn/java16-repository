package view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04ObjectDataManipulation {
	public static void main(String[] args) {
		System.out.println(getItem());
	}
	private static List<Item> getItem(){
		Item item1 = new Item(1, "item1", 100, 1);
		Item item2 = new Item(2, "item2", 200, 1);
		Item item3 = new Item(3, "item3", 300, 2);
		Item item4 = new Item(4, "item4", 400, 2);

		return Arrays.asList(item1, item2, item3, item4);
		
	}
  
}
