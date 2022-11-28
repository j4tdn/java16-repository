package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// Luu tru, quan ly danh sach ky hieu bien so xe
// tung tinh thanh o Viet Nam
// Ky hieu bien so, thanh pho tuong ung
// 92 --> Quang Nam
// 43 --> Da Nang
// 75 --> Thua Thien Hue
// 74 --> Quang Tri
// 73 --> Quang Binh
// --> Map --> HashMap, LinkedHashMap, TreeMap
// HashMap: Khong duy tri thu tu cac phan tu dua vao
// LinkedHashMap: Duy tri thu tu cac phan tu dua vao
// TreeMap: Tu dong sap xep theo KEY
//		  : KEY yeu cau con cua Comparable<K>
public class Ex01BasicMapDemo {
	public static void main(String[] args) {
//		Comparator<Integer> keyDescComparator = new Comparator<Integer>() {
//			public int compare(Integer k1, Integer k2) {
//				return k2 - k1;
//			}
//		};
//		Comparator<Integer> keyDescComparator = Comparator.reverseOrder();
		Map<Integer, String> model = new TreeMap<>((k1, k2) -> k2 - k1);
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Thua Thien Hue");
		model.put(74, "Quang Tri");
		model.put(73, "Quang Binh");

//		model.put(43, "DN");
//		model.putIfAbsent(43, "asdflkasdjf");

//		model.remove(43);

		System.out.println("model size --> " + model.size());
		if (model.containsKey(43))
			System.out.println("Key 43 --> " + model.get(43));
		printf(model);
	}

	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
