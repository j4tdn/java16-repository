package homework;

import java.util.Scanner;
import java.lang.Math;

public class Ex06Integer200th {
	private static boolean isInteger(int number) {
		if (number <= 1)
			return false;
		if (number > 1 && number < 4)
			return true;
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int number = 0;
		do {
			number++;
			if (isInteger(number)) {
				i++;
			}
		}
		while (i<200);
		System.out.println(number);
		sc.close();
	}
}
