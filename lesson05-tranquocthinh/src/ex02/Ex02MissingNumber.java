package ex02;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1, 6 };
		int N = a.length;
		System.out.println(isGetMissingNumber(a, N));
	}

	public static int isGetMissingNumber(int[] a, int n) {
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum -= a[i];
		}
		return sum;
	}

}
