package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLargest3rd {
	public static void main(String[] args) {
		int[] array = { 7, 8, 8, 8, 6, 2, 5, 1 };
		// sắp xếp lớn đến bé
		sort(array);
		// lọc phần tử trùng
		List<Integer> rs =  duplicate(array);
		// in ra vị trí thứ 3
		System.out.println(rs.get(2));
	}

	private static void sort(int source[]) {
		int temp = 0;
		for (int i = 1; i < source.length; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] < source[j]) {
					temp = source[i];
					source[i] = source[j];
					source[j] = temp;
				}
			}
		}
	}

	private static List<Integer> duplicate(int source[]) {

		List<Integer> list = new ArrayList<Integer>();
		for (Integer element : source) {
			// Check if element not exist in list, perform add element to list
			if (!list.contains(element)) {
				list.add(element);
			}
		}
		return list;
	}
}
