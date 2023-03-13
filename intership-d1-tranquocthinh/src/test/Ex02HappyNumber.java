package test;

import java.util.HashSet;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		int n = 19;
		if (isHappyNumber(n)) {
			System.out.println(n + " is happy number ");
		} else {
			System.out.println(n + " is not happy number ");
		}
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
