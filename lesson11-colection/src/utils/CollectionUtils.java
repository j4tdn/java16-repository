package utils;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	@SuppressWarnings("unused")
	public static <K,V>void printf(Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();
		for(Entry<K, V> entry:entries) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

}
