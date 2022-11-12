package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		selectionSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	// sorting ascending
	private static void selectionSort(int[] elements) {
		// elements has N elements --> N rounds
		// each round --> find max, min(asc/desc) per round
		
		// Loop left --> right
		// if (a[left] > a[right] --> swap --> ASC
		// if (a[right] > a[left] --> swap --> DESC
		for (int round = elements.length-1; round > 0; round--) {
			// - round - 1: kiem tra phan tu da min hoac max chua
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					// swap
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
