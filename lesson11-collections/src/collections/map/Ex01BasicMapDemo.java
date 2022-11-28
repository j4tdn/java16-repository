package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*lưu trữ, quản lý danh sách ký hiệu biển số xe
 * ==> ký hiệu biển số : thành phố tương ứng
 * --Map --> HashMap, LinkedHashMap, TreeMap
 * 
 * HashMap		: không duy trì các phần tử đưa vào
 * LinkedHashMap: duy trì thứ tư các phần tử truyền vào
 * TreeMap 		: Tư đông sắp xếp tăng dần theo KEY
 * 				: Key yêu cầu là con của Comparable<K>
 */
public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		//k1, k2, k3, k4, k5
		//if (compareTo(k1,k2) > 0  --> swap ==> aces
		//Comparator<Integer> keyDescComparator = (k1, k2) -> k2 -k1;
		//Map<Integer, String> model = new TreeMap<>(keyDescComparator);
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");// lưu trữ key và hashing ... dãy số và in ra theo thứ tư hashing value
		model.put(43, "Đà Nẵng");
		model.put(75, "THừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");// nếu có key thì value sẽ được thay mới
		model.putIfAbsent(43, "ĐN"); // kiểm tra nếu đã có key thì không thêm
		
		//model.remove(43);
		
		System.out.println("model size: " + model.size());
		if(model.containsKey(43)) {			
			System.out.println("43 -----> " + model.get(43));
		}
		printf(model);
	}
	
	private static void printf(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet(); //lấy tất cả p.tu trong map đưa về set
		for(Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
		
	}

}
