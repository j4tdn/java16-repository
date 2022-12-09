package collections.map;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * luu tru ki hieeu cac bieen so tuong ung voi thanh pho
 *  92 - quang nam 
 *   43 - da nang
 *   ----> Map --> HashMap,LinkerHasMap
 *   HashMap : khoong duy tri thu tự phần tử đưa vào
 *   
 */

public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		//Map<Integer,String> model = new HashMap<Integer, String>();
		Map<Integer,String> model = new TreeMap<Integer, String>(Comparator.reverseOrder());
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Huế");
		model.put(74, "Quảng Trị");
		printf(model);
		
	}
	private static void printf(Map<Integer, String> map) {
		//Set<Entry<Integer,String>> entries = map.entrySet();
		for (Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
			
		}
	}
}
