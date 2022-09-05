package ex01;

public class IsExponential {

	public static void main(String[] args) {
		int a = 64;
		int b = 4;
		if (isPowerOf(a, b) == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean isPowerOf(int a, int b) {
		if (b <= 0 || a <= 0) {
			return false;
		}
		if (a < b) {
			double n = Math.log(b) / Math.log(a);
			return Math.ceil(n) == Math.floor(n);
		} else {
			double x = Math.log(a) / Math.log(b);
			return Math.ceil(x) == Math.floor(x);
		}
	}
}
