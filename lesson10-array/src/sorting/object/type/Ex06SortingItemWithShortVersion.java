package sorting.object.type;

import java.util.Arrays;
import static java.util.Comparator.*;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithShortVersion {
	public static void main(String[] args) {
		// Arrays.sort(primitive)
		// Arrays.sort(String/Integer/Item) --> sub class of comparable
		// Arrays.sort(Item[],comparator<Item>)

		// proble: override Comparable#compareTo(that): --> verbose
		// override Comparable#compareTo(c1,c2): --> verbose

		Item[] items = getItems();

		// 3.name(asc)
		//method reference
		Arrays.sort(items, comparing(Item::getName));
		ArrayUtils.printf("3.Items by name(asc)", items);
		
		//4.storeId(asc), price(desc)
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getPrice,reverseOrder()));
		ArrayUtils.printf("4.storeId(asc), price(desc)", items);
		
		//null first
		items[0] = null;
		items[4] = null;
		Arrays.sort(items, nullsLast((comparing(Item::getStoreId).thenComparing(Item::getPrice,reverseOrder()))));
		ArrayUtils.printf("4.storeId(asc), price(desc)", items);
		
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 102),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 230, 102), new Item(5, "Item 5", 620, 102), };

	}
}