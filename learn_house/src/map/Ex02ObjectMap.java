package map;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;

import bean.Item;
import bean.Warehouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		Map<Warehouse, List<Item>> warehouse = inventory();
		warehouse.put(new Warehouse("WH 2 ", "Hue"), Arrays.asList(new Item(1, "A", 50, 800)));
		System.out.println(warehouse.size());
		loop(warehouse);
	}

	private static Map<Warehouse, List<Item>> inventory() {
		Map<Warehouse, List<Item>> inventory = new HashMap<>();

		inventory.put(new Warehouse("WH 1 ", "Da Nang"), Arrays.asList(new Item(1, "A", 50, 800)));
		inventory.put(new Warehouse("WH 2 ", "Hue"), Arrays.asList(new Item(2, "B", 20, 100)));
		inventory.put(new Warehouse("WH 3 ", "Quang Nam"), Arrays.asList(new Item(3, "C", 30, 100)));

		return inventory;
	}
	private static <K,V> void loop(Map<K, V> map) {
		for (java.util.Map.Entry<K, V>  entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
	}

}
