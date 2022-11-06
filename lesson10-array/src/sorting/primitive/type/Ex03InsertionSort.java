package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digit = { 1, 5, 11, 9, 4, 6 };
		insertionSort(digit);
		ArrayUtils.printf("digit", digit);
	}

	// sorting ascending
	private static void insertionSort(int[] element) {
		// Array has N element --> N rounds
		// Each round --> find max,min(asc,desc) per round

		// Loop left --> right
		// if(a[left] > a[right] --> swap --> ASC
		// if(a[left] < a[right] --> swap --> DESC
		for (int round = 1; round < element.length; round++) {
			for (int i = 0; i < round; i++) {
				if (element[i] > element[round]) {
					int tmp = element[i];
					element[i] = element[round];
					element[round] = tmp;
				}
			}
		}
	}
}