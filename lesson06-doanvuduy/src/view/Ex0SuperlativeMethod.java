package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0SuperlativeMethod {

	public static void main(String[] args) {
		int a, b;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter a: ");
				a = sc.nextInt();
				System.out.print("Enter b: ");
				b = sc.nextInt();
				if (a == 0) {
					throw new ArithmeticException();
				}
				System.out.println("phuong trinh co nghiem x = " + (float) -b / a);
			} catch (InputMismatchException e) {
				System.out.println("a or b can not be character!");
				System.out.println("Please enter again!");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("a can't equal 0!");
				System.out.println("Please enter again!");
			}
		}
	}

}