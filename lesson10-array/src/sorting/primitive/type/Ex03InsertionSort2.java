package sorting.primitive.type;

import java.lang.reflect.Array;
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03InsertionSort2 {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };

		// sort ascending
		insertionSort(digits);
		ArrayUtils.printf("digit", digits);
	}

	private static void insertionSort(int[] elements) {
		// Array has N elements --> has N rounds
		// each round --> find max, min in each round
		// ASC
		for (int round = 1; round < elements.length; round ++) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					int temp = elements[i];
					elements[i] = elements[round];
					elements[round] = temp;
					
				}
			}
		}
	}
}
