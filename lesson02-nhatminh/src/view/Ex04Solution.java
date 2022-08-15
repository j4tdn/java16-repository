package view;

public class Ex04Solution {
	public static void main(String[] args) {
		int[] numbers = { 2 };
		System.out.println("max odd: " + findMaxOddElement(numbers));
	}

	public static int findMaxOddElement(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element : elements) {
			if (isOdd(element) && element > max) {
				max = element;
			}
		}
		if (max == Integer.MIN_VALUE) {
			System.out.println("Array has no odd element!!!");
			System.exit(0);
		}
		return max;
	}

	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
