package ex03;

public class LeastCommonMultiple {
	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int getLeastCommonMultiple(int[] A, int n) {
		int result = lcm(A[0], A[1]);
		for (int i = 2; i < n; i++) {
			result = lcm(A[i], lcm(A[i - 2], A[i - 1]));
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 4, 6, 8 };
		System.out.println(getLeastCommonMultiple(A, A.length));
	}
}
