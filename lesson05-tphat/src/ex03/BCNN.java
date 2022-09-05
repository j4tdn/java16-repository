package ex03;

import java.util.Scanner;

public class BCNN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] a = new int[20];
		System.out.println("Enter number: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("\"Enter the numeric element " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		System.out.println(BCNNofArr(a, n));
	}

	public static int UCLN(int a, int b) {
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}

	public static int BCNNofArr(int a[], int n) {
		int value = BCNN(a[0], a[1]);
		for (int i = 2; i < n; i++) {
			value = BCNN(value, a[i]);
		}
		return value;
	}
}
