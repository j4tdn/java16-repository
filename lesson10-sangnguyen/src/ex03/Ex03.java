package ex03;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("Input: ");
		System.out.println(Arrays.toString(items));
		System.out.println("Onput: ");
		System.out.println(Arrays.toString(getMaxOfSalesPriceInStoryId(items)));
	}
	
	public static Item[] getMaxOfSalesPriceInStoryId(Item[] items) {
		int[] indexOfMax = new int[1000];
	    indexOfMax[0] = 0;
	    boolean kt[] = new boolean[1000];
	    for (int i = 0; i < kt.length; i++) {
	    	kt[i] = true;
	    	indexOfMax[i] = -1;
	    }
		for (int i = 0; i < items.length; i++) {
			if (kt[items[i].getStoryId()]) {
				indexOfMax[items[i].getStoryId()] = i;
				kt[items[i].getStoryId()] = false;
				for (int j = 0; j < items.length; j++) {
					if ((items[j].getStoryId() == items[i].getStoryId()) && (items[j].getSalesPrice() > items[i].getSalesPrice())) {
						indexOfMax[items[j].getStoryId()] = j;
					}
				}
			}
		}
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE; 
		Item[] output = new Item[1000];
		for (int i = 0; i < indexOfMax.length; i++) {
			if (indexOfMax[i] != -1) {
				output[i] = items[indexOfMax[i]];
				if (i < min) min = i;
				if (i > max) max = i;
			}
		}
		return Arrays.copyOfRange(output, min, max+1);
	}
	
	public static Item[] getItems() {
		return new Item[] {
			new Item(1, "A" ,25, 101),
			new Item(2, "B", 90, 106),
			new Item(3, "C", 88, 107),
			new Item(4, "D", 0, 108),
			new Item(5, "E", 60, 101),
			new Item(6, "F", 18, 104),
			new Item(7, "G", 100, 103),
			new Item(8, "H", 302, 102),
			new Item(9, "I", 184, 108),
			new Item(10, "J", 104, 104),
			
		};
		
	}

}
