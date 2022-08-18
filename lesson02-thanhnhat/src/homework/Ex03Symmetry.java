package homework;

import java.util.Scanner;

public class Ex03Symmetry {
	public static void main(String[] args) {

		System.out.print(isSymetric(1235321));

	}

	private static boolean isSymetric(int number) {
		int sym = 0;
		int temp = number;
		while (number != 0) {
			sym = sym * 10 + number % 10;
			number /= 10;

		}

		return temp == sym;
	}

}
