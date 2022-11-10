package sorting.basic;

import utils.ArrayUtils;

public class Ex03InsertionSort3 {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		insertionSort(digits);
		ArrayUtils.printf("digits ", digits);
	}

	// sorting ascending
	private static void insertionSort(int[] elements) {
		// Aray has n elements --> N rounds
		// each round --> find max, min(asc/desc) per round
		
		// Loop left --> right
		// if (a[left] > a[right]) --> swap --> ASC
		// if (a[left] < a[right]) --> swap --> DESC
		for (int round = 1; round < elements.length; round++) {
			for (int i = 0; i < round; i++) {
				if (elements[i] < elements[round]) {
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
