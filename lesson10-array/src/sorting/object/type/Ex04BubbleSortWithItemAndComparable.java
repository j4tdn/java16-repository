package sorting.object.type;

import java.lang.reflect.Array;
import java.util.Arrays;

import common.Item;
import sorting.object.type.Ex01BubbleSortWithString.NullOption;

public class Ex04BubbleSortWithItemAndComparable {
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
				if(i1.getPrice() - i2.getPrice()>0) {
					Item tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
			}
			}
	}
	}
	
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "Item 1", 350, 101),
				new Item(2, "Item 2", 351, 102),
				new Item(3, "Item 3", 352, 101),
				new Item(4, "Item 4", 353, 102),
				new Item(5, "Item 5", 354, 102),

		};
	}
	public static Item[] getItems1() {
		return new Item[] {new Item(1, "Item 1", 350, 101),new Item(2, "Item 2", 351, 102),
				new Item(3, "Item 3", 352, 101),new Item(4, "Item 4", 353, 102),new Item(5, "Item 5", 354, 102),};

		}

	}
	

