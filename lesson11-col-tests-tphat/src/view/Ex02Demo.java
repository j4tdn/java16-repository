package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02Demo {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(4));
	}

	private static boolean isHappyNumber(int number) {
		Set<Integer> a = new HashSet<Integer>();
		int resutl = 0;
		while (true) {
			if (resutl == 1) {
				return true;
			}

			if (a.contains(resutl)) {
				return false;
			}
			a.add(resutl);

			resutl = 0;
			while (number > 0) {
				resutl += (number % 10) * (number % 10);
				number /= 10;
			}
			number = resutl;
		}
	}
}
