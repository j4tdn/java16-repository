package view;

/**
 * Bài 2: Viết chương trình tính tổng S = 4! +7! + 12! + 18!
 */

public class Ex02SumFactorial {
	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("sum = " + sum);
	}

	private static long factorial(int number) {
		if (number < 0) {
			return 0;
		}

		if (number == 0) {
			return 1;
		}

		long fact = number;
		for (int i = number - 1; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
