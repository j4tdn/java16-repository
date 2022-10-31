package sorting.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {

	public static void main(String[] args) {
		int[] digits = {1, 5, 11, 9, 4, 6};
		
		bubbleSortAscending(digits);
		ArrayUtils.printf("Bubble Sort Ascending", digits);
	}
	
	//sorting ascending
	private static void bubbleSortAscending(int[] elements) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (elements[i] >  elements[i+1]) {
					int temp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = temp;
				}
			}
		}
	}
}
