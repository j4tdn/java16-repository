package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// Luu tru, quan ly danh sach ky hieu bien so xe
// tung tinh thanh o VN
// --> Ky hieu bien so, thanh pho tuong ung
//     43 -> Dn
//     75 -> Hue
//     74 -> QTri
//     92 -> QNam
//     73 -> QBinh
// --> Map --> HashMap, LinkedHashMap, TreeMap
//     HashMap: ko duy tri thu tu phan tu dua vao
//     LinkedHashMap : duy tri thu tu phan tu dua vao
//     TreeMap : tu dong sap xep theo KEY
//             : KEY yeu cau con cua Comparable<K>
public class Ex01BasicMapDemo {

	public static void main(String[] args) {
	
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "QNam");
		model.put(43, "Dn");
		model.put(74, "QTri");
		model.put(75, "Hue");
		model.put(73, "QBinh");
		
		
		model.remove(43);
		
		System.out.println("model size --> " + model.size());
		if(model.containsKey(43)) {
		System.out.println("key 43 --> " + model.get(43));
		}
		printf(model);
	}
	
	private static void printf(Map<Integer, String> map) {
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry: entries) {
			
			System.out.println(entry.getKey()+ " --> "+ entry.getValue());
		}
	}
}
