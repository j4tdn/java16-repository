package view;

import java.util.Random;

public class Ex02SumFactorial {
	static Random rd = new Random();

	public static void main(String[] args) {
		int number = 0;
		long fsum = sum(number);
		System.out.println("\n" + fsum);
		System.out.println("2nd way: "+ sumOfFactorial2nd(8,3,16,4));

	}

	private static long factorial(int n) {
		int i;
		long fact = 1;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	private static long sum(int number) {
		long sum = 0;
		for (int i = 0; i < 4; i++) {
			number = 1 + rd.nextInt(20);
			System.out.print(number + " + ");
			long a = factorial(number);
			sum += a;
		}
		return sum;
	}

	private static int factorial2nd(int n) {
		int result = n;
		while (n > 1) {
			result *= --n;
		}
		return result;
	}

	private static int sumOfFactorial2nd(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += factorial(number);
		}
		return sum;
	}
}
