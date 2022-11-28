package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumbers {
	public static void main(String[] args) {

	}

	public static Boolean checkHappyNumber(int number) {
		Set<Integer> digits = new HashSet<Integer>();
		while (digits.add(number)) {
			int result = 0;
			while (number > 0) {
				result += Math.pow(number % 10, 2);
				number = number / 10;
			}
			number = result;
		}
		return number == 1;
	}
}
