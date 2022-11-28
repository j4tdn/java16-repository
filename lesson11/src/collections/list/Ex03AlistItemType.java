package collections.list;

import model.DataModel;

public class Ex03AlistItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();
		
		Item itemToBeRemoved = new Item(99, "Item 99", 200, 101);
		
		printf("items", items);
	}
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " --> {");
		for(Item item: items) {
			System.out.println(item);
		}
		System.out.println("}");
	}
}