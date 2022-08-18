package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number need to check: ");
		int number = ip.nextInt();
		if (checkSymmetric(number) == true) {
			System.out.println(number + " is the symmetrical number");
		} else {
			System.out.println(number + " is not the symmetrical number");
		}
	}

	private static boolean checkSymmetric(int number) {
		int number2 = number;
		int sum = 0;
		while (number2 > 0) {
			sum = 10 * sum + number2 % 10;
			number2 = number2 / 10;
		}
		if (sum == number) {
			return true;
		} else
			return false;
	}
}
