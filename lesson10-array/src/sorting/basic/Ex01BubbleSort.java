package sorting.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6, 2 };
		bubbleSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	// O(n^2)
	// compare consecutive items
	private static void bubbleSort(int arr[]) {
		int n = arr.length;
		// array has N elements => N-1 rounds (round equivalent to i)
		// find MIN and MAX for each round, those value will be fixed
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
