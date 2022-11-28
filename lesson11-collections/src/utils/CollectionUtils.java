package utils;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionUtils {
	public CollectionUtils() {

	}

	public static <K, V> void pritnf(Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry : entries) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}
