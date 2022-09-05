package ex01;

import java.lang.Math;

public class Pow {
	public static void main(String[] args) {
		int a = 1, b = 1;

		if (isPowerOf(a, b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	
	static boolean isPowerOf(int a, int b) {
		int x = 0;
		if (a == b)
			return true;
		if (a > b) {
			for (int i = 0; i<40; i++) {
				x = (int) Math.pow(b, i);
				if (x == a)
					return true;
				if (x > a)
					break;
				return false;
			}
		}

		if (b > a) {
			for (int i = 0; i<40; i++) {
				x = (int) Math.pow(a, i);
				if (x == b)
					return true;
				if (x > b)
					break;
				return false;
			}
		}
		return false;
	}

}
