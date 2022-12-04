package collection.list;

import java.util.Iterator;
import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();
		
		//Item itemToBeRemoved = new Item(99,"Item 99" , 10 , 101);
		Item itemToBeRemoved = new Item(8,"Item 8" , 120.0,102);
		items.remove(itemToBeRemoved);
		
		System.out.println("size --> " + items.size());
		printf("items", items);
		
		// contains,remove
		
		// duyet tung phan tu trong items
		// kiem tra neu co phan tu nao items[i].equals(itemToBeRemoved)
		// else --> false
		
		//remove if --> xoa items co id >5
		items.removeIf(item -> item.getId() > 5);
		printf("items > 5", items);
		
	}
	
	private static void printf(String prefix , List<Item> items) {
		System.out.println(prefix +" --> {");
		for (Item item:items) {
			System.out.println(item);
		}
	}
	
	private static boolean removeIf(List<String> elements , Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			// each.compareTo("F") < 0
			// test(each) --> strategy method
			if(c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
}
