package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/* 	lưu trữ, quản lý các danh sách ký hiệu biển số xe
	số xe từng tỉnh thành của việt nam
	==> lưu ký hiệu biển sô, thành phố tương ứng
 	73 ==> Quảng Bình
	74 ==> QUảng Trị
	75 ==> Huế
	43 ==> Đà Nẵng
	92 ==> QUảng Nam 
	Map --> HashMap,LinkedHashMap,TreeMap
	HashMap: không duy trì các thứ tự các phần tử đưa vào (KEY có thể được phép null)
	LinkedHashMap: giúp duy trì thứ tự các phần tử đưa vào (KEY có thể được phép null)
	 
	TreeMap: Tự dộng sắp xếp theo KEY
	 	   : KEY yêu cầu con của Comparable<K>
*/

public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		//Comparator<Integer> KeyDescComparatpr = (k1,k2) -> k2 - k1;
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");
		// model.putIfAbsent(43, "ĐN");
		
		//model.remove(43);
		System.out.println("model size: " + model.size());
		if(model.containsKey(43)) {
			System.out.println("43 ->" + model.get(43));
		}

		printf(model);
	}

	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "----->" + entry.getValue());
		}
	}
}
