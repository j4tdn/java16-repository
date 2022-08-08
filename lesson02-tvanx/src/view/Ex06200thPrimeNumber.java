package view;

import java.util.Scanner;

public class Ex06200thPrimeNumber {
	public static void main(String[] args) {
		fine200thPrime();
	}

	public static void fine200thPrime() {
		int dem = 0;
		int number = 0;
		while (dem < 200) {
			number += 1;
			if (checkPrime(number)) {
				dem += 1;
			}
		}
		System.out.println("the prime 200th: " + number);
	}

	private static boolean checkPrime(int number) {
		if (number < 2) {
			return false;
		} else if (number == 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;

	}
}
