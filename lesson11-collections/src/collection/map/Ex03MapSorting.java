package collection.map;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03MapSorting {
	public static void main(String[] args) {
		Map<Integer, String> map = getModel();
		
		CollectionUtils.printf("", map);
		System.out.println("================");
		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		list.sort( (e1,e2)-> e1.getValue().compareTo(e2.getValue()));
		Map<Integer, String> sortedmap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : list) {
			sortedmap.put(entry.getKey(), entry.getValue());
		}
		CollectionUtils.printf("", sortedmap);
		
	}
	
	private static Map<Integer, String> getModel(){
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
