package homework;

import java.util.Random;

public class Ex02SumOfFactorial {
	private static int factorial(int number) {
		if (number < 2)
			return 1;
		else
			return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int number1 = rd.nextInt(10);
		int number2 = rd.nextInt(10);
		int number3 = rd.nextInt(10);
		int number4 = rd.nextInt(10);
		System.out.println("Number 1 : " + number1);
		System.out.println("Number 2 : " + number2);
		System.out.println("Number 3 : " + number3);
		System.out.println("Number 4 : " + number4);
		System.out.println(factorial(number1) + factorial(number2) + factorial(number3) + factorial(number4));
	}
}
