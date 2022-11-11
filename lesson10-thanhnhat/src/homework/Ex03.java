package homework;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		findHighestPrice(items);
	}
	private static void findHighestPrice(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				Item i1 = items[i];
				Item i2 = items[i+1];
				if (i1.getSalesPrice() - i2.getSalesPrice() < 0) {
					Item temp = items[i];
					items[i] = items[i+1];
					items[i+1] = temp;
				}
			}
		}
		System.out.println(items[0]);
	}

	private static Item[] getItems() {
		return new Item[] { 
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102), 
				new Item(4, "D", 40, 101), 
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101)};

	}
}
