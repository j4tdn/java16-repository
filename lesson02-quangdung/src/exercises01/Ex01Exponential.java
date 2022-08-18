package exercises01;

import java.util.Scanner;

public class Ex01Exponential {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scan.nextInt();
		if (isPowerOfTwo(number) == true) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

	private static boolean isPowerOfTwo(int number) {
		if(number < 0)
			return false;
		if (0 == number || 1 == number)
			return true;
		while (number >= 2) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}

}
