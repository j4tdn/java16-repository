package sorting.object.type;

import java.util.Arrays;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubleSortWithItemAndComparable {
	public static void main(String[] args) {
		Item[] items = getItems();
		ArrayUtils.printf("items", items);
		// sort items by name descending
		
		System.out.println("================");
		bubbleSort(items, NullOption.NULL_FIRST);
		ArrayUtils.printf("sorted items", items);
	}
	
	public static Item[] getItems() {
		return new Item[] {
			new Item(1, "Item1", 350, 101),	
			new Item(8, "Item8", 120, 102),	
			new Item(2, "Item2", 450, 101),	
			new Item(9, "Item9", 250, 102),	
			new Item(5, "Item5", 620, 102),	
		};
	}
	
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOption.NULL_FIRST);
	}
	
	public static int compareTo(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}
	
	private static void bubbleSort(Item[] elements, NullOption no) {
		for (int round = 0; round < elements.length - 1; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				Item i1 = elements[i];
				Item i2 = elements[i + 1];
				// step 1 --> handle null values
				if (NullOption.NULL_FIRST.equals(no)) {
					// expected ==> null null null ... others ...
					// pre(NULL), next (NULL || !NULL) --> no-swap
					// pre(!NULL), next(NULL) --> swap
					if (i1 == null) {
						continue;
					}
					// sure --> s1(!null)
					if (i2 == null) {
						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure --> s1(!null) s2(!null)
				} else if (NullOption.NULL_LAST.equals(no)) {
					if (i1 == null && i2 != null) {
						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure -- s1(!null)
					if (i2 == null) {
						continue;
					}
					
				}
				// step 1 --> end
				
				// step 2 --> handle non-null values --> ASC
				// --> doi dieu kien cho nay la duoc ne
				if (compareTo(i1, i2) > 0) {
				// swap
					Item tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
}
