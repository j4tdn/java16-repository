package view;

import utils.ArrayUtils;

public class Ex02MissingElement {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 6, 5 };

		System.out.println("Missing element: " + findMissingNumber(numbers));
	}

	private static int findMissingNumber(int[] numbers) {

		int N = numbers.length + 1;

		int sum = N * (N + 1) / 2;

		int sumOfElements = 0;
		for (int number : numbers) {
			sumOfElements += number;
		}

		return sum - sumOfElements;
	}

}
