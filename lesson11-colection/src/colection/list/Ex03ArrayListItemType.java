package colection.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03ArrayListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItem();
		Item itemToBeRemove = new Item(99, "Item 99", 200, 201);
		items.remove(itemToBeRemove);
		
		printf("item", items);
	}
	private static void printf(String prefix, List<Item> item) {
		System.out.println(prefix + "--> {");
		for(Item i:item) {
			System.out.println(i +",");
		}System.out.println("}");
	}

}
