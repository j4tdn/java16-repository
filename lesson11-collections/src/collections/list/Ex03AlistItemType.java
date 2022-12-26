package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AlistItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();
		
		// Item itemToBeRemoved = new Item(99, "Item 99", 200, 101);
		Item itemToBeRemoved = new Item(8, "Item 8", 120.0, 102);
		items.remove(itemToBeRemoved);
		
		System.out.println("size --> " + items.size());
		printf("items", items);
		// contains, remove
		
		// Duyệt từng phần tử trong items
		// Kiểm tra nếu có phần tử nào items[i].equals(itemToBeRemoved) --> true
		// else --> false
		
		// removeIf --> xóa items có id > 5
		items.removeIf(item -> item.getId() > 5);
		printf("items > 5", items);
	}
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " --> {");
		for(Item item: items) {
			System.out.println(item);
		}
		System.out.println("}");
	}
}