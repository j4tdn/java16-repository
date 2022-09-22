package homework;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		float result = 0;
		a = inputNumber("Enter a:", true);
		b = inputNumber("Enter b:", false);
		result = (float) -b / a;
		System.out.println("Result: " + result);
	}
	private static int inputNumber(String text, Boolean checkZero) {
		int number;
		do {
			try {
				System.out.println(text);
				number = Integer.parseInt(ip.nextLine());
				if (checkZero) {
					if (number == 0) {
						System.out.println("Please enter a != 0");
						continue;
					}
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter number");
				e.printStackTrace();
			}
		} while (true);
		return number;
	}
}
