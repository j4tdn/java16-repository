package sorting.basic;

import utils.ArrayUtils;

public class Ex02SelectionSort_geeksforgeeks {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6, 2 };
		selectionSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	// O(n^2)
	private static void selectionSort(int[] arr) {
		int n = arr.length;
		// loop round from the right to left
		// compare each element with all of its left elements
		for (int round = n - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (arr[round] < arr[i]) {
					int temp = arr[round];
					arr[round] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
