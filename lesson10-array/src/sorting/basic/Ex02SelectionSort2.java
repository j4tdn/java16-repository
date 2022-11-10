package sorting.basic;

import utils.ArrayUtils;

public class Ex02SelectionSort2 {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		selectionSort(digits);
		ArrayUtils.printf("digits ", digits);
	}

	// sorting ascending
	private static void selectionSort(int[] elements) {
		// Aray
		//
		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] < elements[round]) {
					// swapt ==> ASC
					// i: previous
					// i+1: next
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
