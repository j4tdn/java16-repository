package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * K: key bắt buộc khác nhau
 Lưu trữ hay quản lý danh sách : ký hiệu biển số xe của từng tỉnh thành 
 --> Ký hiệu biển số, thành phố tương ứng
     92 --> Quảng nam
     43 --> Đà Nẵng
     75 --> Thừa thiên huế
     74 --> Quảng Trị
     73 --> Quảng Bình
     MAp--> HAshMap, LinkedHashMap, TreeMap
     HashMAp: không duy trì thứ tự các phần tử đưa vào
     LinkedHashMap: duy trì thứ tự phần tử đã đưa vào
     
     TreMap: tự động xắp xết theo KEY, Key không được null
           : KEY bắt buộc phải là con của Comparable<K>
*/
public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		Comparator<Integer> ketDessComparator = Comparator.reverseOrder();//xắp xếp tăng dần--> thành giảm dần
		Map<Integer, String> model = new TreeMap<>(ketDessComparator);
		model.put(92, "Quang Nam");//lưu 1 list: trong đó có 2 đối tươngj
		model.put(43, "Da Nang");//mỗi đối tượng lưu 1 thuộc tính
		model.put(75, "Thua thien hue");
		model.put(74, "Quang Tri");
		model.put(73, "Quang Binh");
		//model.putIfAbsent(null, null): kiểm tra key chưa tồn tại mới put vào
		
		model.remove(43);
		
		System.out.println("model -->" + model.size());
		
		if(model.containsKey(43)) {
		System.out.println("key 43-->" +model.get(43));
		}
		
		printf(model);
	}
	private static void printf(Map<Integer, String> map) {//for each
		Set<Entry<Integer, String>> entries=map.entrySet();//map.entrySet : lấy tất cả các phần tử
		for(Entry<Integer, String> entry: entries) {//trong map đưa về set
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

}
