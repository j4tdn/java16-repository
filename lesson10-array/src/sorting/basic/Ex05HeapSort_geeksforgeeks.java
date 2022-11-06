package sorting.basic;

import utils.ArrayUtils;

public class Ex05HeapSort_geeksforgeeks {
	public static void main(String[] args) {
		int[] digits = { 4, 10, 3, 5, 1 };
		sort(digits);
		ArrayUtils.printf("digits", digits);
	}

	private static void sort(int arr[]) {
		int N = arr.length;

		// Build heap (rearrange array)
		for (int i = N / 2 - 1; i >= 0; i--)
			heapify(arr, N, i);

		// One by one extract an element from heap
		for (int i = N - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i
	// i: index in arr[]
	// n: size of heap
	private static void heapify(int arr[], int N, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < N && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest
		if (r < N && arr[r] > arr[largest])
			largest = r;

		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("r = " + r);
		System.out.println("arr[i] = " + arr[i]);
		System.out.println("arr[l] = " + arr[l]);
		System.out.println("arr[r] = " + arr[r]);
		System.out.println("largest = " + largest);
		System.out.println("arr[largest] = " + arr[largest]);
		
		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, N, largest);
		}
	}
}
