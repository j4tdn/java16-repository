package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AlistItemType {
	public static void main(String[] args) {

		List<Item> items = DataModel.getItems();
		// contains , remove
		Item itemToBoRemove = new Item(4, "Item 4", 230.0, 102);
		items.remove(itemToBoRemove);
		printf("items", items);
		// Xoa item co id > 5
		items.removeIf(s -> s.getId() > 5); 		
		printf("items > 5", items);
	}
	private static void printf(String s,List<Item> items)
	{
		System.out.println(s + "--> {");
		for(Item item: items)
		{
			System.out.println(item + ", ");
		}
		System.out.println("}");
	}
	
}
