package sorting.basic;

import utils.ArrayUtils;

public class Ex06QuickSort_geeksforgeeks {
	public static void main(String[] args) {
		int[] digits = { 4, 10, 3, 5, 1 };
		quickSort(digits, 0, digits.length - 1);
		ArrayUtils.printf("digits", digits);
	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		// Index of smaller element and indicates the right position of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				// Increment index of smaller element
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return (i + 1);
	}

	/*
	 * The main function that implements QuickSort arr[] 
	 * low --> Starting index, high --> Ending index
	 */
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pi is partitioning index, arr[p] is now at right place
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
}
