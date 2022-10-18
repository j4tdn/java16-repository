package view;

import java.util.Arrays;

public class Ex04_PrimeTogether {
	public static void main(String[] args) {
		System.out.println("result: " + primeTogether(24, 75));
		System.out.println("result: " + primeTogether(75, 15));
	}

	private static boolean primeTogether(int first, int second) {
		return compare(divisorPrime(first), divisorPrime(second));
	}

	private static boolean compare(int[] divisor1, int[] divisor2) {
		if (divisor1.length != divisor2.length) {
			return false;
		}
		for (int i = 0; i < divisor1.length; i++) {
			if (divisor1[i] != divisor2[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] divisorPrime(int number) {
		if (number < 2) {
			return null;
		}

		int[] div = new int[number / 2];
		int length = 0;

		for (int i = 2; i <= number; i++) {

			if (number % i == 0) {
				length++;
				div[length - 1] = i;
			}

			while (number % i == 0) {
				number = number / i;
			}
		}

		System.out.println(Arrays.toString(trim(div, length)));
		return trim(div, length);
	}

	private static int[] trim(int digits[], int length) {
		// if digits.lenght > length => should throw exception

		int result[] = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = digits[i];
		}
		return result;
	}

}
