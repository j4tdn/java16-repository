package sorting.object.type;

import common.Item;
import common.NullOption;
import ultis.ArraysUtils2;

public class Ex03BubbleSortWithItemAndNthPriority {
	public static void main(String[] args) {
		Item[] items = getItem();
		ArraysUtils2.printf("item ", items);
		//sort item by storeId(ASC), itemId(DeSC)
		bubbleSort1(items, NullOption.NULL_LAST);
		ArraysUtils2.printf("price item ", items);
	}
	public static Item[] getItem() {
		return new Item[] {
				new Item(1,"Item 1", 350, 101),
				new Item(8,"Item 2", 120, 102),
				new Item(2,"Item 3", 450, 101),
				new Item(9,"Item 4", 250, 102),
				new Item(5,"Item 5", 620, 102),
		};
	}
	private static void bubbleSort1(Item[] ele, NullOption no) {
		for(int round = 0; round < ele.length; round++) {
			for(int i = 0; i <ele.length - round - 1; i++) {
				Item s1 = ele[i];
			    Item s2 = ele[i+1];
				if(NullOption.NULL_FIRST.equals(no)) {
					if(s1 == null) {
						continue;
					}
					if(s2 == null) {
						Item tmp = ele[i];
						ele[i] = ele[i+1];
						ele[i+1] = tmp;
						continue;
					}
				}else if(NullOption.NULL_LAST.equals(no)) {
					if(s2 == null) {
						continue;
					}
					if(s1 == null) {
						Item tmp = ele[i];
						ele[i] = ele[i+1];
						ele[i+1] = tmp;
						continue;
					}
				}
				if(s1.getGetStoreId() > s2.getGetStoreId()) {
					Item tmp = ele[i];
					ele[i] = ele[i+1];
					ele[i+1] = tmp;
				}
				else if(s1.getGetStoreId() == s2.getGetStoreId()) {
					if(s1.getId() > s2.getId()) {
						Item tmp = ele[i];
						ele[i] = ele[i+1];
						ele[i+1] = tmp;
					}
				}
				
			}
		}
	}

}


