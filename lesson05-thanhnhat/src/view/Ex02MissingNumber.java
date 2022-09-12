package view;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int n = 6;
		int[] numbers = { 3, 2, 1, 6, 5 };
		System.out.println("Missing element: " + getMissingNumber(numbers, 6));
	}

	private static int getMissingNumber(int[] numbers, int n) {
		int sumAll = n * (n + 1) / 2;
		int sumArray = sum(numbers);
		return sumAll - sumArray;

	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
