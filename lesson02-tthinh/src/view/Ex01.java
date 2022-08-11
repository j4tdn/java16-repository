package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = ip.nextInt();
		if (isPowerOfTwo(number)) {
			System.out.println(number + " is number of two");
		} else {
			System.out.println(number + " is not number of two");
		}
	}

	private static boolean isPowerOfTwo(int number) {
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
		}
		return true;
	}
}
