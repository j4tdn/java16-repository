package collections.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionsUtils;

public class Ex03MapSorting {
	public static void main(String[] args) {
		Map<Integer, String> model = getModel();		
		// map --> set<entry> --> list<entry> --> sort
		// sortingList<entry> --> map
		CollectionsUtils.printf(sort(model));
	}

	private static Map<Integer, String> sort(Map<Integer, String> map) {
		Set<Entry<Integer, String>> set = map.entrySet();
		
		List<Entry<Integer, String>> list = new LinkedList<>(set);
		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;

	}

	private static Map<Integer, String> getModel() {
		return new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put(92, "Quảng Nam");
				put(43, "Đà Nẵng");
				put(75, "Thừa Thiên Huế");
				put(74, "Quảng Trị");
				put(73, "Quảng Bình");
			}
		};
	}
}
