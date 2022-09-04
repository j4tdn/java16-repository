package ex03_triangle;

public class TrianglePascal {
	public static void main(String args[]) {
		System.out.println();
		int n, i, j;
		n = 5;

		for (i = 0; i <= n; i++) {
//	         for(j = 0; j <= n-i; j++){
//	            System.out.print("");
//	         }
			for (j = 0; j <= i; j++) {
				System.out.print(" " + divideFactorial(i, j));
			}
			System.out.println();
		}
	}

	private static int factorial(int n) {
		int f;

		for (f = 1; n > 1; n--) {
			f *= n;
		}
		return f;
	}

	private static int divideFactorial(int n, int r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}
}
