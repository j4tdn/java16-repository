package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import ultis.ArraysUtils2;

public class Ex06SortingItemWithSortVersion {
	public static void main(String[] args) {
		Item[] items = getItem();
		//1.Sort Item by ItemId(asc)
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		ArraysUtils2.printf("Name: ", items);
		
	}
	public static Item[] getItem() {
		return new Item[] {
				new Item(1,"Item 1", 350, 101),
				new Item(8,"Item 2", 120, 102),
				new Item(2,"Item 3", 450, 101),
				new Item(9,"Item 4", 250, 102),
				new Item(5,"Item 5", 620, 102),
		};
	}

}
