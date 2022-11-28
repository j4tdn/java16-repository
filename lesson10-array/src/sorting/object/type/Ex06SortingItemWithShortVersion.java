package sorting.object.type;

import java.util.Arrays;

import java.util.Comparator;
import static java.util.Comparator.*;
import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Arrays.sort(primitive)
		// rrays.sort(String/Integer/Item) --> sub class of Comparable nhưng
		// chỉ sort được 1 lần
		// Arrays.sort(Item[], Comparator<Item>)--. dùng được nhiều biết 1 lần

		// vấn đê: với comparable phải override hàm compareTo(that)
		// với comparatỏ phải override hàm compareTo(c1,c2)
		// quá dài

		// dùng sort có sẵn như sau

		Item[] items = getItems();
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});

		// lambda
		Arrays.sort(items, (i1, i2) -> i1.getName().compareTo(i2.getName()));
		ArrayUtils.printf("name asc", items);

		// T-->Item
		// R -->String(name)
		// (c1, c2)
		//
		Arrays.sort(items, Comparator.comparing(Item::getName));
		ArrayUtils.printf("name asc", items);

		// 4. storeId(asc), price(asc)
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice));
		ArrayUtils.printf("storeId(asc), price(asc)", items);
		// 5. storeId(asc), price(desc)
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice, reverseOrder()));
		ArrayUtils.printf("storeId(asc), price(desc)", items);
		// 6. storeId(asc), price(desc), null first
		
		items[1]=null;
		items[4]=null;
		Arrays.sort(items,nullsLast(Comparator.comparing(Item::getStoreId).thenComparing(Item::getPrice, reverseOrder()))) ;
		ArrayUtils.printf("storeId(asc), price(desc)", items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item1", 350, 101), new Item(8, "Item8", 120, 102),
				new Item(2, "Item2", 450, 101), new Item(9, "Item9", 250, 102), new Item(5, "Item5", 620, 102), };
	}

}
