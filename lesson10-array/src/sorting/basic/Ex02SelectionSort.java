package sorting.basic;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };

		System.out.println("=================");
		selectionSort(digits);
		ArrayUtils.prinf("digits", digits);
	}

//sorting ascending
	private static void selectionSort(int[] elements) {

		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[round] < elements[round]) {
					// swap
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
