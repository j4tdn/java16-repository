package colection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex01BaiscDemoMap {
	public static void main(String[] args) {
		
	
		TreeMap hash = new TreeMap(Comparator.reverseOrder());
		hash.put(92, "Quang Nam");
		hash.put(43, "da nang");
		hash.put(59, "sai gon");
		hash.put(49, "da lat");
		hash.put(75, "Hue");
		hash.remove(43);
		if(hash.containsKey(43)) {
			printf(hash);	
		}
			
	}
	
	private static void printf(Map<Integer, String> entries) {
		entries.entrySet().forEach(o -> System.out.println(o));
	}

}
