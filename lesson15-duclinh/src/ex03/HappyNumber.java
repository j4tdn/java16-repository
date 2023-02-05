package ex03;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 28;
		if (isHappyNumber(n) == true)
			System.out.println(n + " is a Happy number");
		else
			System.out.println(n + " is not a Happy number");
	}

	public static int numSquareSum(int n) {
		int squareSum = 0;
		while (n != 0) {
			squareSum += (n % 10) * (n % 10);
			n /= 10;
		}
		return squareSum;
	}

	public static boolean isHappyNumber(int n) {
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
}
