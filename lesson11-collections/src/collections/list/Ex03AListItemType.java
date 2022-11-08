package collections.list;

import java.util.Arrays;
import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {

	public static void main(String[] args) {
		List<Item> items = DataModel.getItem();
		printf("before remove", items);
		Item itemToBeRemove = new Item(9, "Item 99", 200, 101);
		
		printf("after remove", items);
		items.removeIf(o->o.getId()>5);
		printf("after remove", items);
	}
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + "-->{");
		for (Item item : items) {
			System.out.println(item + " , ");
		}
		System.out.println("}");
	}

}
