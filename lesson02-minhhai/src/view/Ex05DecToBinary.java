package view;

import java.util.Scanner;

public class Ex05DecToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so can chuyen doi: ");
		int n = ip.nextInt();
		System.out.print("Dang nhi phan cua " + n + " :");
		dec2Bin(n);
	}

	private static void dec2Bin(int n) {
		int[] a = new int[100];
		int i;
		for (i = 0; n > 0; i++) {
			a[i] = n % 2;
			n = n / 2;
		}
		for (i = i - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
