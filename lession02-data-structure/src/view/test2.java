package view;

import java.util.Random;

public class test2 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number1 = rd.nextInt(10);
		int number2 = rd.nextInt(10);
		int number3 = rd.nextInt(10);
		int number4 = rd.nextInt(10);
        int sum =factorial(number1) + factorial(number2) + factorial(number3) + factorial(number4);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
        System.out.println( sum);
	}
	private static int factorial(int number) {
		if (number < 0) {
			return 0;
		}

		if (number == 0) {
			return 1;
		}

		int n = number;
		for (int i = number - 1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
	

}