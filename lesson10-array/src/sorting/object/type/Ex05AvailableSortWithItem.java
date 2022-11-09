package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArrayUtils;

public class Ex05AvailableSortWithItem {
	public static void main(String[] args) {

		Item[] items = getItems();
		// Arrays.sort(x[]) --> X implements Comparable<x>
		//1. Sorting item descending by storeId
		Arrays.sort(items);
		ArrayUtils.printf("1. Sorting item descending by storeId: ", items);
	    
		// Comparator 
		//2. Sorting item storeId(asc), price(desc)
	
	    Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				// TODO Auto-generated method stub
				
				if(i1.getStoreId()  > i2.getStoreId())
				{
					return 1;
				}
				if(i1.getStoreId() < i2.getStoreId())
				{
					return -1;
				}
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
	    	
		});
	    ArrayUtils.printf("2. Sorting item storeId(asc), price(desc)", items);
	
	  //3. Sorting item name(asc) & null last
	    items[0] = null;
	    items[3] = null;
		
	    Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				// TODO Auto-generated method stub
				
				if(i1 == null && i2 != null)
				{
					return 1;
				}
				if(i2 == null)
				{
					return -1;
				}
				return i1.getName().compareTo(i2.getName());
	    	
			}
			});
	    ArrayUtils.printf("3. Sorting item name(asc) & null last", items);
	    
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
