package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int b;
		do {
			try {
				System.out.println("Enter a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Enter b: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("X = " + devide(a, b));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter integer!!!");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	private static float devide(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("Please enter a != 0");
		}
		return (float) (-b / a);

	}

}
