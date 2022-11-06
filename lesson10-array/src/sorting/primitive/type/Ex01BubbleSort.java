package sorting.primitive.type;

import java.lang.reflect.Array;
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };

		// sort ascending
		bubbleSort(digits);
		ArrayUtils.printf("digit", digits);
	}
	private static void bubbleSort(int[] elements) {
		// Array has N elements --> has N rounds
		// each round --> find max, min in each round
		// ASC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (elements[i] > elements[i + 1]) {
					// swap
					int temp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = temp;
				}
			}
		}
	}
}
