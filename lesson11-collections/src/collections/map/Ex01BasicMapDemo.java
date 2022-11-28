package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.print.attribute.HashAttributeSet;

/*
 * luu danh sach ky hieu bien so xe tung tinh thanh o VN
 --> Ky hieu tuong ung: 
 	+ 92 --> Quang Nam
 	+ 43 --> Da Nang
 	+ 75 --> Hue
 	+ 74 --> Quang Tri
 	+ 73 --> Quang Binh
 	map --> HashMap, LinkedHashMap, TreeMap 
 	HashMap: Khong duy tri thu tu cac phan tu dua vao
 	LinkedHashMap: Duy tri thu tu cac phan tu dua vao
 	
 	TreeMap: tu dong sap xep theo KEY --> KEY yeu cau con cua Comparable<K>
 */


public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		/*Comparable<Integer> keyDescComparator = (Comparable<Integer>) new Comparator<Integer>() {
			@Override
			public int compare(Integer k1, Integer k2) {
				return k2-k1;
			}
		}; */
		
		//Comparable<Integer> keyDescComparator = (k1, k2) -> {k2-k1}
		
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		model.put(73, "Quang Binh");
		model.putIfAbsent(43, "DN");
		
		model.remove(43);
		
		System.out.println("model size --> " + model.size());
		if (model.containsKey(43)) {
			System.out.println("key 43 --> " + model.get(43));
		}
		printf(model);
	}
	
	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
	}
}
