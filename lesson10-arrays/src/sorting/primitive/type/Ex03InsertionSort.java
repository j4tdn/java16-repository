package sorting.primitive.type;

import java.util.Arrays;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = {4, 5, 11, 9, 1, 6};
		// 4 5 9 1 6 11
		// 4 5 1 6 9 11
		// 4 1 5 6 9 11
		// 1 4 5 6 9 11
		
		selectionSort(digits);
		System.out.println(Arrays.toString(digits));
		
		// N*k : if k = N O(N2)
		// N*k : if k = [1 - N] O(Nlog(N))
		
	}
	
	// sorting ascending
	private static void selectionSort(int[] elements) {
		// Array has N elements --> N - 1 rounds
		
		for (int round = elements.length - 1; round  > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[round]) {
					// swap
					// i : current
					// round: pivot
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
