package sorting.primtive.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		bubbleSort(digits);

		ArrayUtils.printf("digisst ", digits);

	}

	// sorting ascending
	private static void bubbleSort(int[] elements) {
		// Array has N elements -->N rounds
		// each round--> find max, min(asc/desc) per round
		
		//loop left --> right
		//if(a[left]>a[right]--> swap-->ASC
		//if(a[left]<a[right]--> swap-->DESC
		
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (elements[i] > elements[i + 1]) {
					// swapt
					// i: previous
					// i+1: next
					int tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}

}
