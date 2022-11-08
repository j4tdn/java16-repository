package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import utils.ArraysUtils;

public class Ex05AvailableSortWithItem {
	public static <T> void main(String[] args) {
		Item[] items = getItem();
		
		//Array s.sort(items);
//		
//		Arrays.asList(getItem())
//		.stream().sorted((o1, o2) -> o1.getStoreID() - o2.getStoreID())
//		.forEach(o -> System.out.println(o));;
       
//	Arrays.sort(items, new Comparator<Item>() {
//
//		@Override
//		public int compare(Item i1, Item i2) {
//			
//			if(i1.getStoreID() > i2.getStoreID()) {
//				return 1;
//			}
//			if(i1.getStoreID() < i2.getStoreID()) {
//				return -1;
//			}
//			return Double.compare(i2.getPrice(), i1.getPrice());
//		}
//	});
	//	ArraysUtils.printf("item sort with comparator", items);
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null) {
					return -1;
					
				}
				if(o2 == null) {
					return 1;
				}
				return o1.getName().compareTo(o2.getName());
			}
		});
		ArraysUtils.printf("item sort with comparator", items);
		
	}
	public static Item[] getItem() {
		return new Item[] {
				null,
				new Item(2, "Siuu1", 10, 2),
				new Item(4, "Siuu2", 2000, 3),
				null,
				new Item(7, "Siuu3", 50, 3),
				new Item(1, "Siuu4", 600, 3),
				
				 
				 
		};
	}

}
