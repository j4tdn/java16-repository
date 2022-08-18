package baitap;

import java.util.Scanner;

public class Ex03CheckSymmetricNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = ip.nextInt();
		if (check(number) == true) {
			System.out.println(number + " is the symmetrical number");
		} else {
			System.out.println(number + " is not the symmetrical number");
		}
	}

	private static boolean check(int number) {
		int number1 = number;
		int sum = 0;
		while (number1 > 0) {
			sum = 10 * sum + number1 % 10;
			number1 /=10;
		}
		if (sum == number) 
			return true;
			return false;
	}

}
