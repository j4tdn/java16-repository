package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		quickSort(digits, 0, digits.length - 1);
		ArrayUtils.printf("digits", digits);
	}

	private static void quickSort(int[] elements, int left, int right) {
		if (left == right)
			return;
		int pivot = elements[left];
		int leftMark = left + 1;
		int rightMark = right;
		while (leftMark != rightMark) {
			while (rightMark != leftMark)
				if (elements[rightMark] < pivot)
					break;
				else 
					rightMark--;
			while (leftMark != rightMark)
				if (elements[leftMark] > pivot)
					break;
				else
					leftMark++;
			if (rightMark != leftMark)
				swap(elements, rightMark, leftMark);
		}
		if (pivot > elements[leftMark]) {
			swap(elements, left, leftMark);
			quickSort(elements, left, leftMark - 1);
			quickSort(elements, leftMark + 1, right);
		} else {
			quickSort(elements, leftMark, right);
		}
	}

	private static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
