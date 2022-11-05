package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItemAndComparable {
	public static void main(String[] args) {
		Item[] items = getItems();
		ArrayUtils.printf("items", items);
		// sort items by price desc

		System.out.println("==============");
		bubbleSort(items, NullOption.NULL_FIRST);
		ArrayUtils.printf("sorted items", items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 101),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 620, 102), };
	}

	private static void bubbleSort(Item[] elements, NullOption no) {
		for (int round = elements.length - 1; round >= 1; round--) {
			for (int i = 0; i < round; i++) {
				if (NullOption.NULL_FIRST.equals(no)) {
					if (elements[i] == null) {
						continue;
					} else if (elements[i + 1] == null) {
						swap(elements, i, i + 1);
						continue;
					}
				} else if (NullOption.NULL_LAST.equals(no)) {
					if (elements[i] == null) {
						swap(elements, i, i + 1);
						continue;
					} else if (elements[i + 1] == null) {
						continue;
					}
				}

				if (compareTo(elements[i], elements[i + 1]) > 0) {
					swap(elements, i, i + 1);
				}
			}
		}
	}

	// neg: name1 < name2
	// pos: name1 > name2
	// 0 : name1 ~ name2
	public static int compareTo(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}

	private static void swap(Item[] elements, int i, int j) {
		Item temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
