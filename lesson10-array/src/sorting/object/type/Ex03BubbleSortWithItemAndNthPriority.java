package sorting.object.type;

import java.util.Arrays;

import common.Item;
import sorting.object.type.Ex01BubbleSortWithString.NullOption;

public class Ex03BubbleSortWithItemAndNthPriority {
	public static void main(String[] args) {
		Item[] items = getItems();
		//ArrayUtils
		// sort items by price descending
		bubbleSort(items);
		System.out.println("==" + Arrays.toString(items) );
	}
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOption.NULL_FIRST);
	}
	private static void bubbleSort(Item[] elements, NullOption no) {
	
		for(int round = 0; round<elements.length;round++) {
			for(int i = 0; i<elements.length - round-1;i++) {
				Item i1 = elements[i];
				Item i2 = elements[i+1];

				if(NullOption.NULL_FIRST.equals(no)) {
					if(i1 == null) {
						continue;
					}
					if(i2 == null) {
						Item tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
				}
				else if(NullOption.NULL_LAST.equals(no)) {
					if(i1 == null && i2 !=null) {
						Item tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
					if(i2 == null) {
						continue;
				}
					// c2 if(i1.getId() - i2.getId()>0) 
					// c3 ==> if(i1.getName().compareTo(i2.getName())<0)
				if(compareTo(i1, i2)< 0) {
					Item tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
			}
			}
	}
	}
	public static int compareTo(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "Item 1", 350, 101),
				new Item(3, "Item 2", 351, 102),
				new Item(4, "Item 3", 353, 101),
				new Item(2, "Item 4", 352, 102),
				new Item(5, "Item 5", 354, 102),

		};
	}
	}
	

