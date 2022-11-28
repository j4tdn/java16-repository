package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItemAndComparable {
	public static void main(String[] args) {
		Item[] items = getItem();
		ArrayUtils.printf("item:",items);
		//sort items by ascending
		System.out.println("===========");
		bubbleSort(items);
		ArrayUtils.printf("Item", items);
	}
	
	public static Item[] getItem() {
		return new Item[] {
				new Item(1,"Item 1",350,101),
				new Item(8,"Item 8",150,101),
				new Item(2,"Item 2",450,101),
				new Item(9,"Item 9",250,102),
				new Item(5,"Item 5",650,102),	
		};
	}
	
	//default is null first
	private static void bubbleSort(Item[] items) {
		bubbleSort(items, NullOption.NULL_FIRST);
	}
	
	//bubblesort with null option
	private static void bubbleSort(Item[] items, NullOption no) {
		for (int row = 0; row < items.length; row++) {
			for (int i = 0; i < items.length - row - 1; i++) {
				Item s1 = items[i]; // pre
				Item s2 = items[i + 1]; // next
				// Step1: handle for null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					if (s1 == null) {
						continue;
					}
					if (s2 == null) {
						Item tmp = items[i];
						items[i] = items[i + 1];
						items[i + 1] = tmp;
						continue;
					}					
				} else if (NullOption.NULL_LAST.equals(no)) {
					if(s1 == null && s2 != null) {
						Item tmp = items[i];
						items[i] = items[i + 1];
						items[i + 1] = tmp;
						continue;
					}
					if(s2 == null) {
						continue;
					}
				}
				//step1: End
				
				// Step2: Handle for not null values
				if (s1.getId() -s2.getId() > 0) {
					Item tmp = items[i];
					items[i] = items[i+1];
					items[i+1] =tmp;
				}
			}
		}
	}
}
