package sorting.basic;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6, 2 };
		insertionSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	// O(n^2)
	// Examine each item and compare it to items on its left
	private static void insertionSort(int[] arr) {
		int n = arr.length;
		// when we come to a "round", all of its ahead elements has been sorted
		for (int round = 0; round < n; round++) {
			for (int i = 0; i < round; i++) {
				if (arr[i] > arr[round]) {
					int temp = arr[round];
					arr[round] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
