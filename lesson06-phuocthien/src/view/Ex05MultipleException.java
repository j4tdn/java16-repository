package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// System.out.println("x = " + findX());
		System.out.println("=================");
		System.out.println("x = " + findXLevel2());
	}

	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");

		if (a == 0) {
			throw new ArithmeticException("Please enter a!- 0");
		}

		return (float) -b / a;

	}

	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.println("Enter " + text + " : ");
			numberAsText = ip.nextLine();
			// \\d+ --> \\d(number) +(1 hoặc n ký tự)
			// -?: optional for -
			if (numberAsText.matches("-?\\d+")) {
				break;
			}
		} while (true);
		return Integer.parseInt(numberAsText);
	}

	private static float findX() {
		Scanner ip = new Scanner(System.in);

		try {
			// NumberFormatException
			// ArithmeticException
			// NullPointerException
			System.out.print("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());

			System.out.print("Enter a: ");
			int b = Integer.parseInt(ip.nextLine());

			return -b / (float) a;
		} catch (Exception e) {
			System.out.println("error --> " + e.getMessage());
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;

	}
}