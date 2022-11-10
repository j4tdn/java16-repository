package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		// dual pivot quick sort
		// default(unique) --> ascending --> Tăng dần
		Arrays.sort(digits);
		reserve(digits);
		ArrayUtils.printf("digits", digits);
	}

	// 1 4 5 6 9 11
	// 1 4 5 6 9
	public static void reserve(int[] elements) {
		for (int i = 0; i < elements.length / 2; i++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length - i - 1];
			elements[elements.length - i - 1] = tmp;
		}
	}
}
