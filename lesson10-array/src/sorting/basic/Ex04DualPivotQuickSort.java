package sorting.basic;

import java.util.Arrays;

import ultis.ArraysUtils;

public class Ex04DualPivotQuickSort {
	public static void main(String[] args) {
		int[] digits= {1,5,9,11,4,6};
		Arrays.sort(digits);
		reverse(digits);
		ArraysUtils.printf("digits", digits);
		reverse(digits);
	}
	public static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i ++) {
			int tmp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = tmp;
		}
	}
	

}
