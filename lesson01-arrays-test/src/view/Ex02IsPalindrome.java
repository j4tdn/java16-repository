package view;

public class Ex02IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		int x1 = x;
		int sum = 0;
		while (x > 0) {

			sum = sum * 10 + x % 10;
			x = x / 10;
		}
		if (sum == x1) {
			return true;
		} else {
			return false;
		}
	}
}
