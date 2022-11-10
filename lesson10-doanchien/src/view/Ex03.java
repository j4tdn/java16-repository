package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItem();
		
		System.out.println("====================");
		
		maxpricestoreId(items);
	}
	
	public static Item[] getItem() {
		return new Item[] {
				new Item(1,"A",25,101),
				new Item(2,"B",90,102),
				new Item(3,"C",88,102),
				new Item(4,"D",40,101),
				new Item(5,"E",60,102),
				new Item(6,"F",18,101),
				
				
		};
	}
	public static void maxpricestoreId(Item[] items) {
		Arrays.sort(items , Comparator.comparing(Item::getStoreId).thenComparing(Item::getSalesPrice,Comparator.reverseOrder()));
		
		System.out.println(items[0]);
		
	}
}
