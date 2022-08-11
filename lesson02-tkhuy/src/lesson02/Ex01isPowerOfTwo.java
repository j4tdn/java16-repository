package lesson02;

import java.util.Scanner;

public class Ex01isPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = ip.nextInt();
		if (Check(number)) {
			System.out.println(number + " is the exponent of two");
		} else {
			System.out.println(number + " is not the exponent of two");
		}

		System.out.println("Finish.");
	}

	private static boolean Check(int number) {
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
