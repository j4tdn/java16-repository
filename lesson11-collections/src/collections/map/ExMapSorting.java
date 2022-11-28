package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import utils.collectionUtils;


public class ExMapSorting {
	public static void main(String[] args) {
		Map<Integer, String> model= getModel();
		
		//map-->set<entry> --> list<entry> --> sort
		//sortedLisst<entry> --> map
		
		collectionUtils.printf(sort(model));
		
	}
	private static Map<Integer, String> sort(Map<Integer, String> map){
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		list.sort((e1, e2)-> e1.getValue(). compareTo(e2.getValue()));
		
		Map<Integer, String> sortedMap = new HashMap<>();
		for(Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}
	private static Map<Integer, String> getModel(){
		return new HashMap<>() {
			private static final long serialVersionUID = 362498820763181265L;
				{
 
			put(92, "Quang Nam");
			put(43, "Da Nang");
			put(75, "Thua thien hue");
			put(74, "Quang Tri");
			put(73, "Quang Binh");
		}
			};
		
		
	}

}
