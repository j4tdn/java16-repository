package ex02;

public class MissingNumber {
	public static boolean isInexist(int[] A, int x) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == x)
				return false;
		}
		return true;
	}

	public static int getMissingNumber(int[] A, int n) {
		int i = 1;
		for (i = 1; i <= n; i++) {
			if (isInexist(A, i))
				break;
		}
		return i;
	}

	public static void main(String[] args) {
		int[] A = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(A, A.length + 1));
	}
}
