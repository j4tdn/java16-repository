package ex03;

import java.util.Arrays;

import bean.Item;

public class Store {
	public static void main(String[] args) {
		Item[] item = init();
		Item[] MaxItem102= findsPriceMax(item, 102);
		printf(MaxItem102);
		Item[] MaxItem101= findsPriceMax(item, 101);
		printf(MaxItem101);
	}
	
	private static Item[] findsPriceMax(Item[] items, int idStore) {
		Item[] rs = new Item[items.length];
		int k = 0;
		double max = 0;
		for(Item item : items) {
			if(item.getSalePrice() >= max && item.getStoreId() == idStore ) {
				max = item.getSalePrice();
			}
			
		} 
		for(Item item : items) {
			if(item.getSalePrice() >= max && item.getStoreId() == idStore ) {
				rs[k++] = item;
			}
			
		} 
		return Arrays.copyOfRange(rs, 0, k);
	}
	private static Item[] init() {
		return new Item[] { 
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101),
				};
	}
	private static void printf(Item[] Items) {
		for (Item Item : Items) {
			System.out.println(Item);
			System.out.println("=======================");
		}
	}
}
