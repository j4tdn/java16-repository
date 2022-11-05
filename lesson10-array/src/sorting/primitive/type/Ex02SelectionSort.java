package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {

	public static void main(String[] args) {
		int[] digits = {1, 5, 11, 9, 4, 6};
		
		selectionSortAscending(digits);
		ArrayUtils.printf("Selection Sort Ascending", digits);
	}
	
	//sorting ascending
	private static void selectionSortAscending(int[] elements) {
		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] >  elements[round]) {
					int temp = elements[i];
					elements[i] = elements[round];
					elements[round] = temp;
				}
			}
		}
	}
}
