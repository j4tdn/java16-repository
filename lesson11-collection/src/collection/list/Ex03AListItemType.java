package collection.list;

import java.util.Iterator;
import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03AListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItems();
		
		Item itemToBeRemoved = new Item(99,"Item 99" , 10 , 101);
		items.remove(itemToBeRemoved);
		
		//
		items.removeIf(item -> item.getId() > 5);
		
	}
	
	private static void printf(String prefix , List<Item> items);
	
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
