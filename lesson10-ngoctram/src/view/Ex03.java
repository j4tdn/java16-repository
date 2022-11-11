package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] arr = new Item[] {
			new Item(1, "A", 25, 101 ),
			new Item(2, "B", 90, 102 ),
			new Item(3, "C", 88, 102 ),
			new Item(4, "D", 40, 101 ),
			new Item(5, "E", 60, 102 ),
			new Item(6, "F", 18, 101 )
		};
		Arrays.sort(arr, Comparator.comparing(Item::getSalesPrice));
		System.out.println(arr[arr.length-1]);
	}
	
	
}	
