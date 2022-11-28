package utils;

import java.util.Map;

public class ColectionUtills {
	private ColectionUtills() {
		
	}
	public static <K, V> void printf(Map<K, V> entries) {
		entries.entrySet().forEach(o -> System.out.println(o));
	}
}
