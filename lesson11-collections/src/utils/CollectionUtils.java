package utils;

import java.util.Map;
import java.util.Set;

public class CollectionUtils {
	private CollectionUtils() {
	}

	@SuppressWarnings("unused")
	public static <K, V> void printf(String prefix, Map<K, V> map) {
		System.out.println(prefix + " :");
		map.forEach((k, v) -> System.out.println(k + "---->" + v));
	}
	
	public static <T> void printf(String prefix, Set<T> set) { 
		System.out.println(prefix + " :");
		set.forEach((e) -> System.out.println(e + " "));
	}
}
