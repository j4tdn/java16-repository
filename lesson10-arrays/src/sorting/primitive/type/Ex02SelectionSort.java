package sorting.primitive.type;

import java.util.Arrays;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = {4, 5, 11, 9, 1, 6};
		// 4 5 9 1 6 11
		// 4 5 1 6 9 11
		// 4 1 5 6 9 11
		// 1 4 5 6 9 11
		
		insertionSort(digits);
		System.out.println(Arrays.toString(digits));
		
	}
	
	// sorting ascending
	private static void insertionSort(int[] elements) {
		// Array has N elements --> N - 1 rounds
		
		
		for (int round = 1; round  < elements.length; round++) {
			for (int i = 0; i < round; i++) {
				
			}
		}
	}
}
