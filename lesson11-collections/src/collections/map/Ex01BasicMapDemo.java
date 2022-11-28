package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Map --> HashMap, LinkedHashMap, TreeMap
 * HashMap: không duy trì thứ tự các phần tử đưa vào
 * LinkedHashMap: duy trì thứ tự các phần tử đưa vào 
 * TreeMap : tự động sắp xếp theo key
 *          + Key yêu cầu con của Comparable<K>
 * 
 * */
public class Ex01BasicMapDemo {

	public static void main(String[] args) {
//		Comparator<Integer> keyDescComparator = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;
//			}
//		
//			
//		};
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(73, "Quảng Bình");
		model.put(74, "Quảng Trị");
		model.put(75, "Huế");
		//model.putIfAbsent(75, "ttHuế");
		
		model.remove(43);
		
		System.out.println("model size -- >" + model.size());
		System.out.println("key 43 --> " + model.get(43));
		printf(model);
	}
	// entry: toàn bộ
	private static void printf(Map<Integer, String> map)
	{
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry : entries)
		{
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
	}
}
