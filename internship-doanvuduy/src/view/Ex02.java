package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		int n = 4;
		if (isHappyNumber(n)) {
			System.out.println(n + " la so hanh phuc");
		} else {
			System.out.println(n + " khong la so hanh phuc");
		}
	}

	private static int squareNumber(int n) {
		int sumSquareNumber = 0;
		while (n != 0) {
			sumSquareNumber += (n % 10) * (n % 10);
			n /= 10;
		}
		return sumSquareNumber;
	}

	private static boolean isHappyNumber(int n) {
		Set<Integer> set = new HashSet<>();
		while (true) {
			n = squareNumber(n);
			if (n == 1) {
				return true;
			}
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
		}
	}

}