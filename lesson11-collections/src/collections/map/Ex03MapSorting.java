package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import utils.CollectionUtils;

public class Ex03MapSorting {
	public static void main(String[] args) {
		// map --> set<entry> --> list<entry> --> sort
		// sortedList<entry> --> sortedMap
		CollectionUtils.printf(sort(getModel()));
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map) {
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new LinkedList<>(set);
		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry: list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static Map<Integer, String> getModel() {
		return new HashMap<>() {
			private static final long serialVersionUID = 415442841421280617L;

		{;
		put(92, "Quảng Nam");
		put(43, "Đà Nẵng");
		put(75, "Thừa Thiên Huế");
		put(74, "Quảng Trị");
		put(73, "Quảng Bình");
		}};
	}
}
