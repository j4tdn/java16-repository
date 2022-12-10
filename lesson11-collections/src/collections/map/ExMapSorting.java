package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import utils.collectionUtils;

//hỗ trợ xắp xếp theo value
public class ExMapSorting {
	public static void main(String[] args) {
		Map<Integer, String> model= getModel();
		
		//map-->duyệt từng phần tử set<entry> thành 1 set -->convert set về list<entry> --> sort
		//lấy sortedList<entry> lấy từng phần tử trong sortedList<entry> 
		//-->duyệt và đưa vào sortedMap lại
		
		collectionUtils.printf(sort(model));
		
	}
	private static Map<Integer, String> sort(Map<Integer, String> map){
		Set<Entry<Integer, String>> set = map.entrySet();//máp-->set
		List<Entry<Integer, String>> list = new LinkedList<>(set);
		list.sort((e1, e2)-> e1.getValue(). compareTo(e2.getValue()));//sort tăng dần theo value
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());//đưa vào sortedMap
		}
		return sortedMap;
		
	}
	private static Map<Integer, String> getModel(){
		return new HashMap<>() {//không khuyến khích
			private static final long serialVersionUID = 362498820763181265L;
				{
 
			put(92, "Quang Nam");
			put(43, "Đa Nang");
			put(75, "Thua thien hue");
			put(74, "Quang Tri");
			put(73, "Quang Binh");
		}
			};
		
		
	}

}
