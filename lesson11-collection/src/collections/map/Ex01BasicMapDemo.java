package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//lưu trữ , quản lý danh sách ký hiện biển số xe từng tỉnh thành ở Việt Nam.
// --> Ký hiện biển số , thành phố tương ứng 
// 43- Đà Nẵng 
// 92 --> Quảng Nam 
// 76 --> Quảng Ngãi 
// 75 --> Thừa  Thiên Huế 
// 74 --> Quảng Trị 
// 73 --> Quảng Bình 

/* --> Map --> HashMap, LinkedHashMap, TreeMap

 		+	HashMap :       không duy trì thứ tự các phần tử đưa vào
		+	LinkedHashMap : duy trì thứ tự các phần tử đưa vào
		+ 	TreeMap : tự động sắp xếp theo KEY
					: KEY yêu cầu con của Comparable<K>
		
 
*/

public class Ex01BasicMapDemo {
	public static void main(String[] args) {
// k1, k2,k3,k4
//if(compareto(k1,k2) >0) --> swap(k1, k2)		

		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Thua  Thien Hue ");
		model.put(74, "Quang Tri");
		model.put(73, "Quang Binh");
		// model.putIfAbsent(43, "DN");

		model.remove(43);

		System.out.println(" model size :" + model.size());
		if (model.containsKey(43)) {
			System.out.println("43 --> " + model.get(43));
		}
		System.out.println("=============================");
		printf(model);

	}

	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

}
