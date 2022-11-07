package sorting.primitive.type;

import java.util.Arrays;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = {4, 5, 11, 9, 1, 6};
		// 4 5 9 1 6 11
		// 4 5 1 6 9 11
		// 4 1 5 6 9 11
		// 1 4 5 6 9 11
		
		bubbleSort(digits);
		System.out.println(Arrays.toString(digits));
		
	}
	
	// sorting ascending
	private static void bubbleSort(int[] elements) {
		// Array has N elements --> N - 1 rounds
		// Each round --> find max, min (asc/desc) per round
		for (int round = 0; round < elements.length - 1; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (elements[i] < elements[i + 1]) {
					// swap
					int tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
}
