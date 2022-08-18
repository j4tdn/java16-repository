package exercises01;

import java.util.Scanner;

public class Ex04MaxOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How much do you want to enter: ");
		int number = sc.nextInt();
		int[] digits = new int[number];
		int max = 0;
		for (int i = 0; i < number; i++) {
			System.out.print("Input number " + (i + 1) + ": ");
			digits[i] = sc.nextInt();
			if (digits[i] % 2 != 0) {
				max = digits[i];
			}
		}

		for (int i = 0; i < number; i++) {
			if (max < digits[i]) {
				max = digits[i];
			}
		}

		System.out.println(max);
	}
}
