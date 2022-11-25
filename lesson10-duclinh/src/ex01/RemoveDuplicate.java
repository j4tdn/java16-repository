package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 3, 1 };
		// way 1

		List<Integer> items = removeDuplicate(array);
		System.out.println(items);

		// way 2
		int[] items1 = removeDuplicate1(array);
		System.out.println(Arrays.toString(items1));

		// way 3
		remove1(array);
	}

	private static void remove1(int source[]) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < source.length; i++) {
			addElement(map, source[i]);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	private static List<Integer> removeDuplicate(int source[]) {

		List<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j < source.length; j++) {
			// set key = 0
			int count = 0;
			// to find out how many time value is appeared in the arry
			for (int i = 0; i < source.length; i++) {
				if (source[i] == source[j]) {
					// if(arr[i] == 1 )
					count++;
				}
			}
			if (count == 1) {
				list.add(source[j]);
			}
		}
		return list;
	}

	private static int[] removeDuplicate1(int source[]) {
		int[] rs = new int[source.length];
		int k = 0;
		for (int j = 0; j < source.length; j++) {
			// set key = 0
			int count = 0;
			// to find out how many time value is appeared in the arry
			for (int i = 0; i < source.length; i++) {
				if (source[i] == source[j]) {
					// (arr[i] == 2 )
					count++;
				}
			}
			if (count == 1) {
				rs[k++] = source[j];
			}
		}
		return Arrays.copyOfRange(rs, 0, k);
	}
}
