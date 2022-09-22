package view;

import java.util.Scanner;

public class Ex05MultipleExceptions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("x = " + findX());
		System.out.println("x = " + findXLevel2());
	}

	private static float findX() {
		try {
			// NumberFormatException
			// ArithmeticException
			// NullPointerException
			System.out.print("Enter a: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.print("Enter b: ");
			int b = Integer.parseInt(sc.nextLine());
			return (float) -b / a;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		sc.close();
		return Integer.MIN_VALUE;
	}

	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.print("Enter " + text + ": ");
			numberAsText = sc.nextLine().trim();
			// -? => optional for - (negative numbers)
			if (numberAsText.matches("-?\\d+")) {
				break;
			}
		} while (true);
		sc.close();
		return Integer.parseInt(numberAsText);
	}

	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a == 0) {
			throw new ArithmeticException("Please enter a != 0");
		}
		return (float) -b / a;
	}

}
