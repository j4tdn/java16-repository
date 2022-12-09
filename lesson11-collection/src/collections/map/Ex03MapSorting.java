package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03MapSorting {
	public static void main(String[] args) {
		Map<Integer, String> model = getModel();
		
		printf(model);
		System.out.println("-->");
		Map<Integer, String> model1 = sort(model);
		printf(model1);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map){
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		list.sort((e1,e2) -> e1.getValue().compareTo(e2.getValue()));
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}
	private static void printf(Map<Integer, String> map) {
		//Set<Entry<Integer,String>> entries = map.entrySet();
		for (Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
			
		}
	}

	private static Map<Integer, String> getModel() {
		Map<Integer, String> model = new HashMap<Integer, String>();
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");
		return model;

	}
}
