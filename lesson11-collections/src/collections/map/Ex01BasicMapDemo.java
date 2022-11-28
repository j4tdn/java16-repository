package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Lưu trữ, quản lý danh sách ký hiệu biển số xe từng tỉnh thành ở Việt Nam -->
 * Ký hiệu biển số, thành phố tương ứng 92 --> Quảng Nam 43 --> Đà Nẵng 75 -->
 * Thừa Thiên Huế 74 --> Quảng Trị 73 --> Quảng Bình --> Map --> HashMap,
 * LinkedHashMap, TreeMap HashMap : Không duy trì thứ tự các phần tử đưa vào
 * LinkedHashMap: duy trì thứ tự các phần tử đưa vào TreeMap : tự động sắp xếp
 * theo KEY : KEY yêu cầu con của Comparable<K>
 * 
 */

public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		// k1 k2 k3 k4 k5
		// if (comparaTo(k1, k2) > 0) --> swap(k1, k2)
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");
		// model.putIfAbsent(43, "ĐN")

		model.remove(43);
		System.out.println("model size --> " + model.size());
		if(model.containsKey(43)) {
		System.out.println("key 43 --> " + model.get(43));}
		printf(model);
	}

	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "----> " + entry.getValue());
		}
	}
}
