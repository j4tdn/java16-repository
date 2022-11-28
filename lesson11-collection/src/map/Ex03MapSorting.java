package map;

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
		Map<Integer, String> model = getModel();

		// Map --> Set<Entry> --> List<Entry> --> Sort
		// sortedList<Entry> --> Map

		CollectionUtils.printf(sort(model));
	}

	private static Map<Integer, String> sort(Map<Integer, String> map) {
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new LinkedList<>(set);
		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : list)
			sortedMap.put(entry.getKey(), entry.getValue());
		return sortedMap;
	}

	private static Map<Integer, String> getModel() {
		return new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put(92, "Quang Nam");
				put(43, "Da Nang");
				put(75, "Thua Thien Hue");
				put(74, "Quang Tri");
				put(73, "Quang Binh");
			}
		};
	}
}
