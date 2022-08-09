package exercises01;

import java.util.Scanner;

public class Ex06Prime {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		while (count < 200) {
			number = number + 1;
			if (checkPrime(number)) {
				count = count + 1;
			}
		}
		System.out.println("the prime 200th: " + number);
	}

	private static boolean checkPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
