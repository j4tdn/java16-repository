package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Lưu trữ, quản lý danh sách kí hiệu biển số xe từng tỉnh thành ở Việt Nam
 * kí hiệu biển số --> tp tương ứng
 *HashMap, linkedMap, treeMap
 *k duy trì thứ tự các phần tử (HashMap)
 *LinkedHasMap: duy trì thứ tự các phần tử đưa vào
 *TreeMap: tự động sắp xếp theo KEY
 */
public class Ex01BasicMapDemo {
	public static void main(String[] args) {
			
		
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");
		
		model.remove(43);
		if(model.containsKey(43)) {
			System.out.println(model.get(43));
		}
		System.out.println(model.size());
		printf(model);
	}
	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

}
