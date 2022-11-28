package collections.list;

import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03ListItemType {
	public static void main(String[] args) {
		List<Item> items = DataModel.getItem();
		
		Item itemToBeRemoved = new Item(99, "Item 99", 200, 101);
		
		items.remove(itemToBeRemoved); 
		print("items", items);
		
		// removeIf --> xóa items có id > 5
		
		items.removeIf(s -> s.getItemId()>5);
		print("items", items);
	}
	
	private static void print(String prefix,List<Item> items) {
		System.out.println(prefix+" --> { ");
		for( Item item:items) {
			System.out.println(item + ", ");
		}
		System.out.println("}");
	
	}
}
