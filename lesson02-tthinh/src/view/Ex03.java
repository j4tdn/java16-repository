package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(checkSysmetricalNumber(123321));
	}

	public static boolean checkSysmetricalNumber(int number) {
		int sym = 0;
		int initialNumber = number;
		while (number != 0) {
			sym = sym * 10 + number % 10;
			number /= 10;
		}
		return number == sym;
	}
}
