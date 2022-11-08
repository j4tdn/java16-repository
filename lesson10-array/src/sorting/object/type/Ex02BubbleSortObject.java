package sorting.object.type;

import java.util.Arrays;

import common.Item;
import utils.ArraysUtils;

public class Ex02BubbleSortObject {
	public static void main(String[] args) {
		//Arrays.asList(getItem()).stream().sorted((o1 , o2) -> (o1.getId()- o2.getId()) ).forEach(a -> System.out.println(a));
		bubbleSort(getItem());
		
		
		
	}
	private static void bubbleSort(Item[] elemetns) {
		for (int round = 0; round < elemetns.length; round++) {
			for (int i = 0; i < elemetns.length - round - 1; i++) {
				Item i1 = elemetns[i];
				Item i2 = elemetns[i+1];
				if(i1 == null) {
					continue;
				}
				if(i2 == null) {
					Item tmp = elemetns[i];
					elemetns[i] = elemetns[i + 1];
					elemetns[i + 1] = tmp;
					continue;
				}
				if ((i1.getStoreID() - i2.getStoreID()  > 0)  ) {
					// swap

					Item tmp = elemetns[i];
					elemetns[i] = elemetns[i + 1];
					elemetns[i + 1] = tmp;
				}else if( i1.getStoreID()  - i2.getStoreID()  == 0) {
					if(i1.getId() - i2.getId() > 0) {
						Item tmp = elemetns[i];
						elemetns[i] = elemetns[i + 1];
						elemetns[i + 1] = tmp;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(elemetns));
	}
	
	private static int compareTo(Item i1, Item i2) {
		if(i1.getStoreID() - i2.getStoreID() < 0) {
			return 1;
		}
		if(i1.getStoreID() - i2.getStoreID() > 0) {
			return -1;
		}
		
		return i1.getStoreID() - i2.getStoreID();
	}
	
	
	public static Item[] getItem() {
		return new Item[] {
				new Item(2, "Siuu1", 10, 2),
				new Item(4, "Siuu2", 2000, 3),
				new Item(7, "Siuu3", 50, 3),
				 new Item(1, "Siuu4", 600, 3),
				 
				 
		};
	}

}
