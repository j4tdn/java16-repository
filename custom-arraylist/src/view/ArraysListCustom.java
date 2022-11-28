package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import arraylist_custom.ListUtils;

public class ArraysListCustom {
	public static void main(String[] args) {
		ListUtils<String> list = new ListUtils<>();
		list.add("Item A");
		list.add("Item B");
		list.add("Item C");
		list.add("Item D");
		
		list.printf();

		ListUtils<String> items = (ListUtils<String>) getItem(list);

		items.printf();

	} 
	private static ListUtils<String> getItem(ListUtils<String> list){
		ListUtils<String> rs = new ListUtils<>();
		list.foreach((element) -> {
			if(element.compareTo("Item C3") < 0) {
				rs.add(element);
			}
		});
		return rs;
	}

}
