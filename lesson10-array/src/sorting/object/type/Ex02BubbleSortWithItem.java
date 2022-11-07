package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItem {
	public static void main(String[] args) {
		Item[] item = getItem();
		ArrayUtils.prinf("items", item);
		// sort item by price ascending
		System.out.println("=======================");
		bubbleSort(item);
		ArrayUtils.prinf("sorted items", item);
	}

	private static void bubbleSort(Item[] elItems) {
		bubbleSort(elItems, NullOption.NULL_FIRST);
	}

	private static void bubbleSort(Item[] elements, NullOption no) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				Item i1 = elements[j]; // pre
				Item i2 = elements[j + 1]; // next
				// step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					if (i1 == null) {
						continue;
					}
					if (i2 == null) {
						Item tmp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = tmp;
						continue;
					}

				} else if (NullOption.NULL_LAST.equals(no)) {
					if (i1 == null && i2 != null) {
						Item tmp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = tmp;
						continue;
					}
					if (i2 == null) {
						continue;
					}
				}
				// step 1: end
				// step 2 --> handle non-null values --> ASC

				// C1 == asc by items price(double) --> if (i1.getPrice() - i2.getPrice() > 0)
				// C2 == asc by items id(integer) --> if (i1.getId() - i2.getId() > 0)
				// C3 == des by items name(String) --> if (i1.getName().compareTo(i2.getName())
				// < 0)
				if (i1.getStoreId() - i2.getStoreId() > 0) {
					// swap
					Item tmp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = tmp;
				} else if (i1.getStoreId() - i2.getStoreId() < 0) {
					continue;
				}else {
					if(i1.getName().compareTo(i2.getName())>0) {
						Item tmp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = tmp;
					}
				}
			}
		}
	}

	public static Item[] getItem() {
		return new Item[] { new Item(1, "Item 1", 350, 101), new Item(8, "Item 8", 120, 101),
				new Item(2, "Item 2", 450, 101), new Item(9, "Item 9", 250, 102), new Item(5, "Item 5", 620, 102), };
	}
}
