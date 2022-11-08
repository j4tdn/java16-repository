package sorting.object.type;

import common.Item;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItem {

	private enum NullOption{
		NULL_FIRST,
		NULL_LAST
	}
	private enum SortType{
		ASC,
		DESC
	}
	
	public static void main(String[] args) {
		Item[] items = getItem();
		ArrayUtils.printf("items", items);
		// sort items by price desc
		System.out.println("===============");
		bubbleSort(items, SortType.ASC, NullOption.NULL_LAST);
		ArrayUtils.printf("items", items);
	}
	
	public static Item[] getItem() {
		return new Item[] {
				null,
				new Item(1, "Item1", 350, 101),
				new Item(8, "Item8", 120, 102),
				new Item(2, "Item2", 450, 101),
				null,
				new Item(9, "Item9", 250, 102),
				new Item(5, "Item5", 620, 102),
				null
		};
	}
	
	private static void bubbleSort(Item[] element, SortType st, NullOption no) {
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element.length - i - 1; j++) {
				if(NullOption.NULL_FIRST.equals(no)) {
					if(element[j] == null) continue;
					if(element[j+1] == null) {
						Item tmp = element[j];
						element[j] = element[j+1];
						element[j+1] = tmp;
						continue;
					}
				}
				else if(NullOption.NULL_LAST.equals(no)) {
					if(element[j+1] == null) continue;
					if(element[j] == null) {
						Item tmp = element[j+1];
						element[j+1] = element[j];
						element[j] = tmp;
						continue;
					}
				}
				if(SortType.ASC.equals(st) ? (element[j].getPrice() - element[j+1].getPrice() > 0) : (element[j].getPrice() - element[j+1].getPrice() < 0)) {
					Item tmp = element[j];
					element[j] = element[j+1];
					element[j+1] = tmp;
				}
			}
		}
	}

}
