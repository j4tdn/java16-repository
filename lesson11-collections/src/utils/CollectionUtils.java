package utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionUtils {
	private CollectionUtils() {
	}

	public static <K, V> void printf(Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry : entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
