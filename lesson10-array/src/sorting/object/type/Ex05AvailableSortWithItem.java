package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//1. Sorting item descending by storeId
		//Arrays.sort(X[])--> X phải implements Comparable<X>
		//-->Để lấy hàm x1.compareTo(x2)
		//defauit: if(this.compareTo(that)>0) -->hoán vị this: trước
		//that: phần tử sau
		Arrays.sort(items);
		ArrayUtils.printf("Sorting item descending by storeId", items);
		
		//2.Sorting item storeId tăng dần, price giảm dần
		//hạn chế của Comparable: hỗ trợ cho 1 phương thức sort
		//ta dùng Comparator
		
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1.getStoreId()>i2.getStoreId()) {
					return 1;
				}if(i1.getStoreId()<i2.getStoreId()) {
					return -1;
				}
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
		
		items[0]=null;
		items[4]=null;
		//3.Sorting item name tăng dần, null last
		ArrayUtils.printf("Sorting item storeId tăng dan, price giảm dan", items);
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				if(i1 == null && i2!=null) {
					return 1;
				}
				if(i2==null) {
					return -1;
				}return i1.getName().compareTo(i2.getName());
			}
		});
		ArrayUtils.printf("3.Sorting item name tăng dần, null last", items);
	}
	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item1", 350, 101), new Item(8, "Item8", 120, 102),
				new Item(2, "Item2", 450, 101), new Item(9, "Item9", 250, 102), new Item(5, "Item5", 620, 102), };
	}

}
