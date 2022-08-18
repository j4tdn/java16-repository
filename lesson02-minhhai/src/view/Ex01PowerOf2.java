package view;

import java.util.Scanner;

public class Ex01PowerOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap so can kiem tra: ");
		int n = ip.nextInt();
		if (isPowerOf2(n)) {
			System.out.println(n + " la luy thua cua 2");
		} else {
			System.out.println(n + " khong phai la luy thua cua 2");
		}
	}

	private static boolean isPowerOf2(int n) {
		return ((n != 0) && (n & (n - 1)) == 0);
	}
}
