
public class Ex03Multiple {
	public static void main(String[] args) {
		int[] A = { 2, 4, 5 };
		getLeastCommonMultiple(A, A.length);
	}

	private static int getLeastCommonMultiple(int[] A, int n) {
		int temp = gcd(A[0], A[1]);
		for (int i = 2; i < n; i++) {
			temp = lcm(A[0], A[1]);
		}
		return getLeastCommonMultiple(A, A.length);
	}

	static int gcd(int a, int b) {
		// Lặp tới khi 1 trong 2 số bằng 0
		while (a * b != 0) {
			if (a > b) {
				a %= b; 
			} else {
				b %= a;
			}
		}
		return a + b;
	}

	static int lcm(int a, int b) {
		return (a * b / gcd(a, b));
	}
}
