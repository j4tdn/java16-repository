package view;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		int number = 19;
		if (HappyNumber(number)) {
			System.out.println(number + " is happy number");
		} else {
			System.out.println(number + " is not happy number");
		}
	}

	private static int squamericNumber(int number) {
		int squameric = 0;
		while (number != 0) {
			squameric += (number % 10) * (number % 10);
			number /= 10;
		}
		return squameric;
	}

	private static boolean HappyNumber(int number) {
		Set<Integer> set = new HashSet<>();
		while (true) {
			number = squamericNumber(number);
			if (number == 1) {
				return true;
			}
			if (set.contains(number)) {
				return false;
			}
			set.add(number);
		}
	}
}
