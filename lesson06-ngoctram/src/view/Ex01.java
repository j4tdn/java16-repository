package view;

import java.util.Scanner;

public class Ex01 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("x = " + findX());
	}

	private static double nextDouble(String text) {
		String numberAsText = "";
		do {
			System.out.print("Enter " + text + ": ");
			numberAsText = sc.nextLine();
			double number = Double.parseDouble(numberAsText);
			return number;
		} while (true);
	}

	private static double findX() {
		double a = nextDouble("a");
		double b = nextDouble("b");
		do {
			try {
				return -b / a;
			} catch (ArithmeticException e) {
				System.out.println("Please enter b!=0");
				b = nextDouble("b");
			}
		} while (true);
	}
}
