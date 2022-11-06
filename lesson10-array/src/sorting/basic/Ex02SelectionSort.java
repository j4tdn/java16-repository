package sorting.basic;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6, 2 };
		selectionSort(digits);
		ArrayUtils.printf("digits", digits);
	}
	
	// O(n^2)
	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i=0; i<n; i++) {
			// FOR THE ELEMENT i-th
			// Find the minimum element in unsorted array
			int index_min = i;
			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[index_min]) {
					index_min = j;
				}
			}
			// Swap the found minimum element with the first element
			if (index_min != i) {
				int temp = arr[index_min];
				arr[index_min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
