package view;

import java.util.Random;

public class Ex02SumFactorial {
	static Random rd = new Random();

	public static void main(String[] args) {
		int number = 0;
		long fsum = sum(number);
		System.out.println("\n" + fsum);

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
}
