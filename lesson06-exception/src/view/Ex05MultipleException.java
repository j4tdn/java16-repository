package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		//System.out.println("x1 = " + findX());
		System.out.println("x2 = " + findXLevel2());
	}

	//
	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a == 0) {
			throw new ArithmeticException("Please enter a!=0");
		}
		return (float) -b / a;
	}

	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.println("Enter " + text + ": ");
			// trim(khoảng trắng hai đầu)
			numberAsText = ip.nextLine().trim();
			// \\d+ --> \\d(number) + (1| n letters)
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
			System.out.println("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());

			System.out.println("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			return (float) -b / a;
			// Khi có nhiều catch -> catch con ở trên cha
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;

	}
}
