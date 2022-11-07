package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex03InsertionSort {

	public static void main(String[] args) {
		int[] digits = { 1,5,11,9,4,6};
		insertionSort(digits);
		ArrayUtils.printf("digits --> ", digits);
	}
	
	// sorting ascending
	private static void insertionSort(int[] elements) {
		for(int round = 1; round < elements.length; round++) {
			
			for(int i = 0; i <  round ; i++) {
				if(elements[round] < elements[i]) {
					
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
