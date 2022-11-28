package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Employee;
import utils.CollectionsUtils;

public class Ex03MapSorting {

	public static void main(String[] args) {

		Map<Integer, String> model = getModel();
		CollectionsUtils.printf(sort(model));

	}

	private static Map<Integer, String> sort(Map<Integer, String> map) {
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

		Map<Integer, String> sortedMap = new HashMap<>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static Map<Integer, String> getModel() {
		return new HashMap<>() {
			private static final long serialVersionUID = 362498820763181265L;;
			{
				put(92, "QNam");
				put(43, "Dn");
				put(74, "QTri");
				put(75, "Hue");
				put(73, "QBinh");

			}
		};
	}
}