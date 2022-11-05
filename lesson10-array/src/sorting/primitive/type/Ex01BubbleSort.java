package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		bubbleSort(digits);
		ArrayUtils.printf("digits", digits);
	}

	private static void bubbleSort(int[] elements) {
		for (int round = elements.length - 1; round >= 1; round--) {
			for (int i = 0; i < round; i++) {
				if (elements[i] > elements[i + 1]) {
					swap(elements, i, i + 1);
				}
			}
		}
	}

	private static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
