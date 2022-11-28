package views;

import java.util.HashSet;
import java.util.Scanner;

public class Ex02HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a non-zero Positive Number:");
		int number = sc.nextInt();
		int result = number;
//		while (result != 1 && result != 4) {
//			result = isHappyNumber(result);
//		}
//		if (result == 1) {
//			System.out.println("It is a Happy Number");
//		} else {
//			System.out.println(" It is not a Happy Number");
//		}
	}

//	public static int isHappyNumber(int number) {
//		int rem = 0, sum = 0;
//		while (number > 0) {
//			rem = number % 10;
//			sum = sum + (rem * rem);
//			number = number / 10;
//		}
//		return sum;
//	}

	private static boolean isHappyNumber(int n) {
		HashSet<Integer> st = new HashSet<>();
		while (true) {
			n = check(n);
			if (n == 1)
				return true;
			if (st.contains(n))
				return false;
			st.add(n);
		}
	}

	private static int check(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return sum;
	}
}
