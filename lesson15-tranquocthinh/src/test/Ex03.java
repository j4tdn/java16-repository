package test;

import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(28)); // true
		System.out.println(isHappyNumber(52)); // false
	}

	private static boolean isHappyNumber(int n) {
		HashSet<Integer> st = new HashSet<>();
		while (true) {
			n = numSquareSum(n);
			if (n == 1)
				return true;
			if (st.contains(n))
				return false;
			st.add(n);
		}
	}

	private static int numSquareSum(int n) {
		int squareSum = 0;
		while (n != 0) {
			squareSum += (n % 10) * (n % 10);
			n /= 10;
		}
		return squareSum;
	}
}
