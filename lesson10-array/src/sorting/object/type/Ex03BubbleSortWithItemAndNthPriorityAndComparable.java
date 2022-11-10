package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex03BubbleSortWithItemAndNthPriorityAndComparable {
	public static void main(String[] args) {
		Item[] items = getItems();
		ArrayUtils.printf("items", items);

		// sort item by storeId(ASC), itemId(DESC)

		System.out.println("===================================");
		bubbleSort(items);
		ArrayUtils.printf("items", items);
	}

	// bubble sort with default is NULL_FIRST
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOption.NULL_FIRST);
	}

	// bubble sort with default is NullOption
	private static void bubbleSort(Item[] elements, NullOption no) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				Item i1 = elements[i]; // previous
				Item i2 = elements[i + 1]; // next

				if (NullOption.NULL_FIRST.equals(no)) {
					if (i1 == null) {
						continue;
					}
					if (i2 == null) {
						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
				} else if (NullOption.NULL_LAST.equals(no)) {
					if (i1 == null && i2 != null) {
						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					if (i2 == null) {
						continue;
					}
				}
				// step 1: end

				// step 2: handle non-null values ---> ASC
				// swap items ---> compare item's price

				// C1 ==> asc by item's price(double) --> if (i1.getPrice() - i2.getPrice() > 0)
				// C2 ==> asc by item's id(double) --> if (i1.getId() - i2.getId() > 0)

				// storeId1 > storeId2 ---> swap
				// storeId1 = storeId2
				// item1 < item2 --> swap
				// other no
				// storeId1 > storeId2 --> no
//				if (i1.getStoreId() - i2.getStoreId() > 0) {
//					Item tmp = elements[i];
//					elements[i] = elements[i + 1];
//					elements[i + 1] = tmp;
//				} else if (i1.getStoreId() - i2.getStoreId() == 0) {
//					if (i1.getId() - i2.getId() > 0) {
//						Item tmp = elements[i];
//						elements[i] = elements[i + 1];
//						elements[i + 1] = tmp;
//					}
//				} else {
//
//				}
				if (compareTo(i1, i2) > 0) {
					Item tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}

	// storeId(DESC), itemId(ASC)
	public static int compareTo(Item i1, Item i2) {
		int storeId1 = i1.getStoreId();
		int storeId2 = i2.getStoreId();

		if (storeId1 < storeId2) {
			return 1; // positive
		}
		if (storeId1 > storeId2) {
			// can be remove
			return -1;
		}
		// storeId1 == storeId2
		return i1.getId() - i2.getId();

	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 102),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 650, 102), };
	}

}
