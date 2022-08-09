package view;

public class Ex02 {
	public static void main(String[] args) {
		int s;
		s = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println(s);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
