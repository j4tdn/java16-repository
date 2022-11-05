package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {

	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		selectionSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	private static void selectionSort(int[] elements) {
		for (int round = 0; round < elements.length - 1; round++) {
			for (int i = round + 1; i < elements.length; i++) {
				if (elements[i] < elements[round]) {
					swap(elements, i, round);
				}
			}
		}
	}

	private static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
