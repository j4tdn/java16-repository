package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * --> Map --> HashMap, TreeMap, LinkHashMap
 * 	   HashMap 		: không duy trì thứ tự các phần tử đưa vào
 * 	   LinkedHashMap: duy trì thứ tự các phần tử đưua vào
 *     TreeMap		: tự động sắp xếp theo Key
 *     				: Key yêu cầu là con của Comparable<K>
 *
 */
public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		Comparator<Integer> ketDescComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		Map<Integer, String> model = new TreeMap<Integer, String>(ketDescComparator);
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(73, "Quảng Bình");
		
		System.out.println("model size --> " + model.size());
		System.out.println("Key 43 : " + model.get(43));
		
		printf(model);
		
		
	}
	
	static void printf(Map<Integer, String> entry) {
		entry.forEach( (k,v) -> System.out.println(k + " ---> " + v));
	}
}
