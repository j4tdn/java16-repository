package view;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items  = getItems();
		maxPrice(items);
	}
	private static Item[] maxPrice(Item[] items) {
		Item[] result = new Item[1];
		double max = items[0].getSalePrice();
		for(int i = 0; i < items.length; i++) {
			if (max <= items[i].getSalePrice()) {
				result[0] = items[i];
			}
			
	            
		}
		return result;
	}
	
	
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 26, 103),
				new Item(4, "D", 745, 165),
				new Item(5, "E", 232, 107),
				new Item(6, "F", 100, 108),
				
				
				 
				 
		};
	}

}