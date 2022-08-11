package view;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int[] number = new int[4];
		int arbitraryNumber = new Random().nextInt(1,10);
		System.out.println("Number 0: " + arbitraryNumber);
		int arbitraryNumber1 = new Random().nextInt(1,10);
		System.out.println("Number 1: " + arbitraryNumber1);
		int arbitraryNumber2 = new Random().nextInt(1,10);
		System.out.println("Number 2: " + arbitraryNumber2);
		int arbitraryNumber3 = new Random().nextInt(1,10);
		System.out.println("Number 3: " + arbitraryNumber3);
		System.out.println(sum(number));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += factorial(number);
		}
		return sum;
	}

	private static int factorial(int number) {
		int fac = 1;
		for (int i = 1; i <= number; i++)
			fac *= i;
		return fac;
	}
}
