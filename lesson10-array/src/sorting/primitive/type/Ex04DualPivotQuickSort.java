package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		// dual pivot quick sort
		// default(unique) --> ascending
		Arrays.sort(digits);
		reverse(digits);
		ArrayUtils.printf("digits", digits);
	}
	
	//-0 1 2 3 4 5
	// 1 4 5 6 9 11 --> 11 9 6 5 4 1
	// 1 4 5 6 9    -->    9 6 5 4 1
	
	public static void reverse(int[] elements) {
		for (int i = 0; i < elements.length/2; i++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length-i-1];
			elements[elements.length-i-1] = tmp;
		}
	}
}
