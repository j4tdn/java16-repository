package exercises01;

import java.util.Scanner;

public class Ex02Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How much do you want to enter: ");
		int number = sc.nextInt();
		int[] digits = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Input number " + (i + 1) + ": ");
			digits[i] = sc.nextInt();
			sum(digits);
		}
		System.out.println("S= " + sum(digits));		
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
