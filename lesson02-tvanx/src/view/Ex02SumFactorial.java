package view;

import java.util.Scanner;

public class Ex02SumFactorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter into the number of number want to total: ");
		int number = ip.nextInt();
		int[] Array = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter into number " + (i + 1) + ": ");
			Array[i] = ip.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += factorial(Array[i]);
		}
		System.out.print("S=");
		for (int i = 0; i < number; i++) {
			if (i < number - 1) {
				System.out.print(Array[i] + "!" + "+");
			} else if (i == number - 1) {
				System.out.print(Array[i] + "!");
			}
		}
		System.out.println("=" + sum);
	}

	private static int factorial(int n) {
		int mul = 1;
		for (int i = n; i > 0; i--) {
			mul *= i;
		}
		return mul;
	}
}
