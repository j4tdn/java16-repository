package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {

	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		Arrays.sort(digits);
		reverse(digits);
		ArrayUtils.printf("digits --> ", digits);
	}

	public static void reverse(int[] elements) {
		for ( int i = 0; i< elements.length/2; i++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length-i-1];
			elements[elements.length-i-1]=tmp;
		}
	}
}
