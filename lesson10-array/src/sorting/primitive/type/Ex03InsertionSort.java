package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		insertionSort(digits);
		ArrayUtils.prinf("digits", digits);

	}

	// sorting ascending
	private static void insertionSort(int[] elements) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left -> right
		// if (a[left]>a[right]) --> swap --> ASC
		// if (a[left]<a[right]) --> swap --> DESC
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (elements[j] > elements[i]) {
					int tmp = elements[j];
					elements[j] = elements[i];
					elements[i] = tmp;
				}
			}
		}
	}
}
