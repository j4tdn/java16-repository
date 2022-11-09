package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import ultis.ArraysUtils2;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] items = getItem();
		//1.sorting item desc by storeId
		Arrays.sort(items);
		ArraysUtils2.printf("Sort Item desc: ", items);
		//2.sorting item storeId asc, price desc
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1.getGetStoreId() > i2.getGetStoreId()) {
					return 1;
				}
				if(i1.getGetStoreId() < i2.getGetStoreId()) {
					return -1;
				}
			    return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
		ArraysUtils2.printf("Sort storeId: ", items);
		//3.sorting Item name asc & null last
		items[0] = null;
		items[4] = null;
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1 == null && i2 != null) {
					return 1;
				}
				if(i2 == null) {
					return -1;
				}
			    return i1.getName().compareTo(i2.getName());
			}
		});
		ArraysUtils2.printf("Sort name: ", items);
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
