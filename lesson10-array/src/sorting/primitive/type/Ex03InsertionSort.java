package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		insertionSort(digits);
		ArrayUtils.printf("digits", digits);
		
		// N*k ==> k=N O(n^2)
		// N*k ==> k = [1-N] O(Nlog(N))

	}

	// sorting ascending
	private static void insertionSort(int[] elements) {
		// Array has N elements ----> N rounds
		// Each round -----> find max, min(asc/desc) per pound

		// Loop left --> right
		// if (a[left] > a[right]) --> swap --> ASC
		// if (a[left] < a[right]) --> swap --> DESC
		for (int round = 1; round < elements.length; round++) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
