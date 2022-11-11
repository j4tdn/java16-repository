package sorting.object.type;

import common.Item;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItem {
	public static void main(String[] args) {
		Item[] item=getItems();
		ArrayUtils.printf("item", item);
		
		
	}
	public static Item[] getItems() {
		return new Item[] {
				new Item(1,"Item1",350,101),
				new Item(8,"Item8",120,102),
				new Item(2,"Item2",450,101),
				new Item(9,"Item9",250,102),
				new Item(5,"Item5",620,102),
		};
	}

}
