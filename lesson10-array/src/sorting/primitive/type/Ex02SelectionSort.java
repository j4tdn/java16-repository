package sorting.primitive.type;

import java.lang.reflect.Array;
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };

		// sort ascending
		selectionSort(digits);
		ArrayUtils.printf("digit", digits);
	}

	private static void selectionSort(int[] elements) {
		// Array has N elements --> has N rounds
		// each round --> find max, min in each round
		// ASC
		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					// swap
					// i: current
					// round: pivot
					int temp = elements[i];
					elements[i] = elements[round];
					elements[round] = temp;
				}
			}
		}
	}
}
