package sorting.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		bubbleSort(digits);
		ArrayUtils.prinf("digits", digits);

	}

	// sorting ascending
	private static void bubbleSort(int[] elements) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round
		// Loop left -> right
		// if (a[left]>a[right]) --> swap --> ASC
		// if (a[left]<a[right]) --> swap --> DESC
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					// swap
					int tmp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = tmp;
				}
			}
		}
	}
}
