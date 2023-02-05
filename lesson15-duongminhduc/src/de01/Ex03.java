package de01;

import java.util.*;

public class Ex03 {
	public static Boolean checkHappyNumber(int number) {
		Set<Integer> digits = new HashSet<Integer>();
		while (digits.add(number)) {
			int result = 0, res = 0;
			while (number > 0) {
				res = number % 10;
				result = result + (res * res);
				number = number / 10;
			}
			number = result;
		}
		return number == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number :");
		int number = sc.nextInt();
		System.out.println(checkHappyNumber(number) ? number + " is a Happy Number" : " is an Unhappy Number");
	}
}