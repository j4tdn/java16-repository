package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		int number = 15;
		isHappy(number);
	}

	private static boolean isHappy(int a) {
		Set<Integer> set = new HashSet<>();
		int temp = 0;
		int temp2 = 0;
		int sum = 0;
		int count = 0;
		if (!(set.contains(a))) {
			set.add(a);
		}
		if (a == 1) {
			return true;
		}
		while (a != 0) {
			temp = a % 10;
			a = a / 10;
			temp = temp * temp;
			for (int i = 0; temp != 0; ++i) {
				temp2 = temp % 10;
				sum += (temp2 * temp2);
				temp /= 10;
			}
		}

		return true;
	}
}
