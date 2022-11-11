package ex03;

import java.util.Arrays;
import static java.util.Comparator.*;

public class FindMaxPrice {
	public static void main(String[] args) {
		Item[] items = getItem();
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalePrice));
		printf("Item", items);
		getMaxValuesOfEachStore(items);
		
	}
	
	private static void getMaxValuesOfEachStore(Item[] items) {
		for(int i=0 ; i<items.length-1;i++) {
			if(items[i].getStoreId()!=items[i+1].getStoreId()) {
				System.out.print(items[i]);
			}
		}
		System.out.print(items[items.length-1]);
		
	}

	public static Item[] getItem() {
		return new Item[] { new Item(1, "A", 25, 101), 
				new Item(2, "B", 90, 102), 
				new Item(3, "C", 88, 102),
				new Item(4, "D", 60, 101), 
				new Item(5, "E", 40, 102), 
				new Item(6, "F", 18, 101),
				new Item(7, "G", 100, 103),
				new Item(8, "H", 50, 103),};
	}
	public static void printf(String prefix, Item[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}
}
