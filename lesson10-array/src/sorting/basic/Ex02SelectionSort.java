package sorting.basic;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		selectionSort(digits);
		ArrayUtils.prinf("digits", digits);

	}

	// sorting ascending
	private static void selectionSort(int[] elements) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left -> right
		// if (a[left]>a[right]) --> swap --> ASC
		// if (a[left]<a[right]) --> swap --> DESC
		for (int i = elements.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (elements[j] > elements[i]) {
					// swap ==> ASC
					// i: pivot
					// j: current
					int tmp = elements[j];
					elements[j] = elements[i];
					elements[i] = tmp;
				}
			}
		}
	}
}
