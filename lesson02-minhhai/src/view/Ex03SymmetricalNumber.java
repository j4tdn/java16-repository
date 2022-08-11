package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println(" Nhap so can kiem tra:");
		int n = ip.nextInt();
		if (reverseNumber(n) == n) {
			System.out.println(n + " la so doi xung");
		} else {
			System.out.println(n + " khong phai la so doi xung");
		}
	}

	private static int reverseNumber(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		return reverse;
	}

}
