package exercises01;

import java.util.Scanner;

public class Ex03Symmetrical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scan.nextInt();
		if (sym(number) == true) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

	private static boolean sym(int number) {
		int residual;
		int compare = number;
		int sum = 0;
		if (number == 0)
			return false;
		while (number != 0) {
			residual = number % 10;
			sum = sum * 10 + residual;
			number = number / 10;
		}
		if (sum == compare)
			return true;
		else
			return false;
	}

}
