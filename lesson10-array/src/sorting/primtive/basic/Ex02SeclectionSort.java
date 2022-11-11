package sorting.primtive.basic;

import utils.ArrayUtils;

public class Ex02SeclectionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		SelectionSort(digits);

		ArrayUtils.printf("digisst ", digits);

	}

	// sorting ascending
	private static void SelectionSort(int[] elements) {
		// Array has N elements -->N rounds
		// each round--> find max, min(asc/desc) per round

		// loop left --> right
		// if(a[left]>a[right]--> swap-->ASC
		// if(a[left]<a[right]--> swap-->DESC

		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					// swapt
					// i: current
					// round: pivot
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}

}
