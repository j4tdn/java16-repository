package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02SumOfFactorial {
	public static void main(String[] args) {
		double sum = 0.0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int arbitraryNumber = rd.nextInt();
		sum = factory(arbitraryNumber);
	}

	// ham tinh giai thua
	public static double factory(int number) {
		double tmp = 1;
		if (number > 1) {
			for (int i = 2; i <= number; i++) {
				tmp *= i;
			}
		}
		return tmp;
	}
}
