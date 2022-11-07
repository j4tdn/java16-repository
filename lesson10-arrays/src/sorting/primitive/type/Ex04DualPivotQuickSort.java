package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {
	public static void main(String[] args) {
		int[] digits = {4, 5, 11, 9, 1, 6};
		// dual pivot quick sort
		// default(unique) --> ascending
		Arrays.sort(digits);
		ArrayUtils.printf("digits:", digits);
		reverse(digits);
		ArrayUtils.printf("reverse:", digits);
	}
	
	// 1 4 5 6 9 11
	
	public static void reverse(int[] elements) {
		int left = 0;
		int right = elements.length - 1;
		while (true) {
			if (left >= right) {
				break;
			}
			int tmp = elements[left];
			elements[left] = elements[right];
			elements[right] = tmp;
			left++;
			right--;
		}
	}
	
	public static void reverses(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			int tmp = elements[i];
		}
	}
}
