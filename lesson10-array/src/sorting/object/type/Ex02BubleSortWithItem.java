package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubleSortWithItem {

	public static void main(String[] args) {
		Item items[] = getItems();
		//sort item by price ascending
		ArrayUtils.printf("Item = ", items);
		System.out.println("=========================");
		
		//sort
		bubbleSortAscending(items);
		ArrayUtils.printf("sort item by price asceding: ", items);

	}
	//bubble sort with default is null_firsl
	private static void bubbleSortAscending(Item[] elements) {
		bubbleSortAscending(elements, NullOption.NULL_FIRST);
	}
	
	
	private static void bubbleSortAscending(Item[] elements, NullOption no) {
			
			for (int round = 0; round < elements.length; round++) {
				for (int i = 0; i < elements.length - round - 1; i++) {						
					Item i1 = elements[i];
					Item i2 = elements[i+1]; 
					
					if (NullOption.NULL_FIRST.equals(no)) {
						if (i1 == null) {
							continue;
						}
						if (i2 == null) {
							Item temp = elements[i];
							elements[i] = elements[i+1];
							elements[i+1] = temp;
							continue;
						}
						
					} else {
						if (i1 == null && i2 != null) {
							Item temp = elements[i];
							elements[i] = elements[i+1];
							elements[i+1] = temp;
							continue;
						}
						if (i2 == null) {
							continue;
						}
					}
					//step 1 --> end
					
					//step 2 --> start
					//swap items --> compare item's price
					
					//case 1: ascending by item's price(double) --> i1.getPrice() - i2.getPrice() > 0
					//case 2: ascending by item's id(int)       --> i1.getId() - i2.getId() > 0
					//case 3: descending by item's name(string)  --> i1.getName().compareTo(i2.getName()) < 0
					if (i1.getName().compareTo(i2.getName()) < 0) {
						Item temp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = temp;
					}
				}
			}
		}	
	
	public static Item[] getItems() {
		return new Item[] {
			new	Item(1, "Item 1", 350, 101),
			new Item(8, "Item 8", 120, 102),
			new Item(2, "Item 2", 450, 101),
			new Item(9, "Item 9", 250, 102),
			new Item(5, "Item 5", 620, 102),
				
		};
	}

}
