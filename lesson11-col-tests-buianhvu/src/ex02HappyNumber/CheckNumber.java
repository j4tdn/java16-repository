package ex02HappyNumber;

import java.util.*;

public class CheckNumber {

	public static Boolean HappyNumber(int number) {
		Set <Integer> digits = new TreeSet<Integer>();
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
