package sorting.object.type;

import java.util.Arrays;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex03BubbleSortWithItemAndNthPriority {
	public static void main(String[] args) {

		Item[] items = getItems();
		ArrayUtils.printf("sorted items", items);
		System.out.println("========");
		bubbleSort(items);
		ArrayUtils.printf("sorted items", items);
	}

	// bubble sort with default is NULL_FIRST
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOption.NULL_FIRST);
	}

	private static void bubbleSort(Item[] elements, NullOption no) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				Item i1 = elements[i];
				Item i2 = elements[i + 1];
				// step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					if (i1 == null) {
						continue;
					}
					if (i2 == null) {
						Item temp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = temp;
						continue;
					}
				} else if (NullOption.NULL_LAST.equals(no)) {

					if (i1 == null && i2 != null) {
						Item temp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = temp;
						continue;
					}
					if (i2 == null) {
						continue;
					}
				}
				// step 1 --> end

				// step 2 --> handle non-null values --> ASC
				// swap items --> compare item's price

				// case 1: asc by item's price --> (i1.getPrice() - i2.getPrice() > 0)
				// case 2: asc by item's itemid(itemid) --> (i1.getId() - i2.getId() > 0)
				// case 3: desc by item's name --> i1.getName().compareTo(i2.getName()) < 0

				// sort items by storeID(ASC) and itemsID(DESC)
				// storeID 1 > storeID2 --> swap
				// storeID1 = storeID2
				// ItemId1 < ItemId2 --> swap
				// other no
				// storeId1 < storeId2 --> no

				/*
				 * if (i1.getStoreId() - i2.getStoreId() < 0) {
				 * 	// swap
				 * Item temp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = temp;

				} else if (i1.getStoreId() - i2.getStoreId() == 0) {
					if (i1.getId() - i2.getId() > 0) {
						Item temp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = temp;
					}
				}
				 */	
				if (compareTo(i1,i2) > 0) {
					Item temp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = temp;
				}
				
			}
		}
	}
	private static int compareTo(Item i1, Item i2) {
		int storeId1 = i1.getStoreId();
		int storeId2 = i2.getStoreId();
		if (storeId1 < storeId2) {
			return 1;
		}
		if (storeId1 > storeId2) {
			return -1;
		}
		// storeId1 == storeId2
		return i1.getId() - i2.getId();
	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 540, 102),
				new Item(2, "Item 2", 690, 101), new Item(5, "Item 5", 220, 102), new Item(9, "Item 9", 160, 102) };

	}

}
