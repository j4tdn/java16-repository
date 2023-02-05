package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(findNumber(19) ? "It is a Happy Number" : "It is not a Happy Number");
	}
	private static boolean findNumber(int number) {
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
