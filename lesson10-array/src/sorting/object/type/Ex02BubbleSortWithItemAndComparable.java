package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItemAndComparable {
	private enum NullOption {
		NULL_FIRST,
		NULL_LAST
	}
	
	public static void main(String[] args) {
		Item[] items = getItems();
		ArrayUtils.printf("item", items);
		System.out.println("================================");
		
		//sort item by price asc
		
		bubbleSort(items);
		ArrayUtils.printf("data: ",  items);

	}

	public static Item[] getItems() {
		return new Item[] { 
				new Item(1, "Item 1", 350, 101),
				new Item(8, "Item 8", 120, 102),
				new Item(2, "Item 2", 450, 101), 
				new Item(9, "Item 9", 230, 102), 
				new Item(5, "Item 5", 620, 102), 
		};

	}
	
	
	//bubble sort with default null first
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOption.NULL_LAST);
	}
	
	private static void bubbleSort(Item[] elements, NullOption no) {
		for(int round = 0; round < elements.length; round++) {
			for(int i = 0; i < elements.length - round -1; i++) {
				Item i1 = elements[i];
				Item i2 = elements[i + 1];
				//Step1: Handle null values --> null first
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

					
				}else if(NullOption.NULL_LAST.equals(no)){
					if(i1 == null && i2 != null) {
						Item tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}

					if(i2 == null) {
						continue;
					}
				}
				
				//Step 2 --> handle non-null values --> ASC
				//Swap item --> compare item'price ==> if(i1.getPrice() - i2.getPrice() > 0)
				// asc by item's Id ==> if(i1.getId() - i2.getId() > 0)
				// desc by item's name ==> ==> if(i1.getNmae(),compareTo(i2.getName()) > 0)
				if(compareTo(i1, i2) > 0) {
					Item tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
					
			}
		}
		
	}
	
	public static int compareTo(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}
	
}