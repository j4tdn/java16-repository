package view;

import java.util.Scanner;

public class Ex04MaxOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua day so:");
		int n = ip.nextInt();
		int[] a = new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap phan tu thu " + i);
			a[i] = ip.nextInt();
		}
		System.out.println("So le lon nhat la:" + checkMaxOdd(n, a));
	}

	private static int checkMaxOdd(int n, int[] a) {
		int m = 0;
		for (int i = 1; i < n; i++) {
			if ((a[i] % 2 == 0) && (a[i] < a[i - 1]))
				m = a[i];
		}
		return m;
	}
}
