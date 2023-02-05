package exam;

import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		Map<Integer, Integer> map = new TreeMap<>();		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				map.put(arr[i], count);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("1. liệt kê các phần tử chỉ xuất hiện không quá một lần duy nhất trong dãy N");
		for(Integer key : map.keySet()) {
			if(map.get(key)==1) {
				System.out.print(key+" ");
			}
		}
		System.out.println();
		System.out.println("2. liệt kê các phần tử xuất hiện nhiều hơn một lần trong dãy N");
		for(Integer key: map.keySet()) {
			if(map.get(key) > 1) {
				System.out.print(key+" ");
			}
		}
	}
}
