package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 50, 10, 12, 30 };
		System.out.println("max odd: " + findMaxOddElement(numbers));
	}

	private static int findMaxOddElement(int[] elements) {
		int max = Integer.MIN_VALUE;
		int countOdd = 0;
		for (int element : elements) {
			if (isOdd(element) && element > max) {
				max = element;
				countOdd++;
			}
		}
		if (countOdd == 0) {
			System.out.println("Array has no odd element!!!");
			System.exit(0);
		}
		return max;
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
