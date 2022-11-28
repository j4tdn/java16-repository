package sorting.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		ArrayUtils.prinf("digits", digits);
		System.out.println("=================");
	}

//sorting ascending
	private static void bubblesort(int[] elements) {

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - i; i++) {
				if (elements[round] > elements[round + 1]) {
					// swap
					int tmp = elements[round];
					elements[round] = elements[round + 1];
					elements[round + 1] = tmp;
				}
			}
		}
	}
}
