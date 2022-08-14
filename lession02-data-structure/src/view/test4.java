package view;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = ip.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu : " + (i + 1));
			a[i] = ip.nextInt();
		}

		System.out.println("So le lon nhat trong day: " + MaxOfOdd(a, n));

	}

	private static int MaxOfOdd(int[] a, int n) {
		int m = a[0];
		for (int i = 1; i < n; i++) {
			if ((a[i] % 2 != 0) && (a[i] > a[i - 1]))
				m = a[i];
		}
		return m;

	}

}
