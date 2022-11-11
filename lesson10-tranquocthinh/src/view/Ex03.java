package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = DataModel.getItems();
		maxPriceInStoreId(items);

	}

	private static void maxPriceInStoreId(Item[] items) {
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));
		System.out.println("The item with the highest selling price of the store " + items[0].getStoreId()
				+ " is item: " + items[0]);
		int storeId = items[0].getStoreId();
		for (Item item : items) {
			if (item.getStoreId() != storeId) {
				storeId = item.getStoreId();
				System.out.println(
						"The item with the highest selling price of the store " + storeId + " is item: " + item);
			}
		}
	}

}
