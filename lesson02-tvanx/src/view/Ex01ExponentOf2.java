package view;

import java.util.Scanner;

public class Ex01ExponentOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = ip.nextInt();
		if (CheckExponent(number)) {
			System.out.println(number + " is the exponent of two");
		} else {
			System.out.println(number + " is not the exponent of two");
		}

		System.out.println("Finish...");
	}

	private static boolean CheckExponent(int number) {
		if (number == 0) {
			return false;
		} else if (number == 1) {
			return true;
		} else {
			while (number > 2) {
				if (number % 2 != 0) {
					return false;
				}
				number = number / 2;
			}
			return true;
		}
	}
}
