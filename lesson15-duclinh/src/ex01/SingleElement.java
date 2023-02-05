package ex01;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SingleElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhập số phần tử của mảng: ");
//		int n = scanner.nextInt();
		// khởi tạo arr
		int[] arr = {1, 2, 3, 4, 5, 6, 5, 5, 5, 3, 1};
//		System.out.println("Nhập các phần tử của mảng: ");
//		for (int i = 0; i < n; i++) {
//			System.out.printf("a[%d] = ", i);
//			arr[i] = scanner.nextInt();
//		}
		// tìm số lần xuất hiện của các phần tử
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < 11; i++) {
			addElement(map, arr[i]);
		}
		System.out.print("Các phần tử xuất hiện 1 lần: ");
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
		System.out.print("\nCác phần tử xuất hiện nhiều hơn 1 lần: ");
		for (Integer key : map.keySet()) {
			if (map.get(key) != 1) {
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
}
