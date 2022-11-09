package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.Comparator.*;

import common.Item;
import utils.ArrayUtils;

public class Ex06SortingItemWithSortVersion {
	public static void main(String[] args) {

		// Arrays.sort(primitive)
		// Arrays.sort(String/Integer/Item) --> sub class of Comparable
		// Arrays.sort(Item[], Comparator<Item>)
		
		// Problem: override Comparable#compareTo(that)
		// Problem: override Comparator#compare(o1, o2)
		//           -> verbose
		
		
		
		Item[] items = getItems();
		
		//1. Sort items by itemId(asc)
		
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
			
		});
		// 2.
		// T --> Item
		// U --> String
		 Arrays.sort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName()); 
		 });
		ArrayUtils.printf("items by Name(asc) ", items);
		
		
		
		
		// 3. item - item.getname() ==> Item: getName(method reference)
		Arrays.sort(items, comparing(
		Item ::getName
		));
		ArrayUtils.printf("last -> items by itemId(asc) ", items);
	
	
		// 4. storeId(asc), price(asc)
		Arrays.sort(items,comparing(Item::getStoreId).thenComparing(Item::getPrice,reverseOrder()));
		
		ArrayUtils.printf("4. storeId(asc), price(asc) ", items);
	
	
		// 5. storeId(asc), price(asc) , null first
		items[0] = null;
		items[3] = null;
		Arrays.sort(items, nullsLast(comparing(Item::getStoreId).thenComparing(Item::getPrice)));
		
		ArrayUtils.printf("5. storeId(asc), price(asc) , null first ", items);
		
	
		
	
	}
	public static Item[] getItems()
	{
		return new Item[] {
				new Item(1, "Item 1", 350, 101),
				new Item(3, "Item 3", 220, 102),
				new Item(2, "Item 2", 120, 101),
				new Item(4, "Item 4", 230, 102),
				new Item(7, "Item 7", 310, 101)
		};
	}
}
