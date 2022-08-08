package homework;

import java.util.Scanner;

public class Ex01IsPowerOf2 {
	private static boolean isPowerOf2(int number) {
		if (number == 1) return true;
		if (number % 2 == 1)
			return false;
		while (number % 2 == 0) {
			number = number / 2;
		}
		if (number == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if (isPowerOf2(number)) {
			System.out.println(number + " is the power of 2");
		}
		else {
			System.out.println(number + " is not the power of 2");
		}
		sc.close();
	}
}
