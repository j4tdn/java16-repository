package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import common.Item;
import model.DataModel;

public class Ex03MostExpensiveItems {
	public static void main(String[] args) {

		List<Item> itemList = DataModel.getItems();
		System.out.println("Danh sách mặt hàng:\n" + itemList);

		List<Item> listMax = findExpensiveItems(itemList);

		System.out.println("Các mặt hàng đắt nhất: ");

		for (Item item : listMax) {
			System.out.print(item);
		}

	}

	private static List<Item> findExpensiveItems(List<Item> itemList) {
		if (itemList.size() == 0) {
			return itemList;
		}

		List<Item> result = new ArrayList<>();

		Collections.sort(itemList,
				Comparator.comparing(Item::getStoreId)
				.thenComparing(Item::getPrice, Comparator.reverseOrder()));

		result.add(itemList.get(0));
		for (int i = 1; i < itemList.size(); i++) {
			if (itemList.get(i - 1).getStoreId() != itemList.get(i).getStoreId()) {
				result.add(itemList.get(i));
			}
		}
		return result;
	}
}
