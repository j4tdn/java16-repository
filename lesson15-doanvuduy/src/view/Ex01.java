package view;

import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };

		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			addElement(map, arr[i]);
		}

		System.out.print("cac phan tu xuat hien 1 lan :");
		for (Integer k : map.keySet()) {
			if (map.get(k) == 1) {
				System.out.print(k + " ");
			}
		}
		System.out.println();
		System.out.print("cac phan tu xuat hien nhieu lan :");
		for (Integer k : map.keySet()) {
			if (map.get(k) == 2) {
				System.out.print(k + " ");
			}
		}
	}

	private static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}
}
