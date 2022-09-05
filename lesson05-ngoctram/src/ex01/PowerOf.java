package ex01;

public class PowerOf {
	private static boolean isPowerOf(int a, int b) {
		if (b < 0) {
			return isPowerOf(a, -b);
		}
		if (a < 0) {
			return isPowerOf(-a, b);
		}
		double n = Math.log(b) / Math.log(a);
		double m = Math.log(a) / Math.log(b);
		if ((Math.ceil(n) == Math.floor(n)) || (Math.ceil(m) == Math.floor(m))) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOf(8, -2));
	}
}
