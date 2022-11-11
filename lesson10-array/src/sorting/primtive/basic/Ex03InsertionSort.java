package sorting.primtive.basic;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		InsertionSort(digits);

		ArrayUtils.printf("digisst ", digits);

	}

	// sorting ascending
	private static void InsertionSort(int[] elements) {
		// Array has N elements -->N rounds
		// each round--> find max, min(asc/desc) per round

		// loop left --> right
		// if(a[left]>a[right]--> swap-->ASC
		// if(a[left]<a[right]--> swap-->DESC

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
