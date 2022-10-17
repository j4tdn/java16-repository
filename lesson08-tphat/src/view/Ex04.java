package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập số a: ");
		a = ip.nextInt();
		System.out.println("Nhập số b: ");
		b = ip.nextInt();
		handlePrime(a, b);
	}

	private static boolean checkPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	private static void handlePrime(int a, int b) {
		boolean check = true;
		int c;
		if (((a % 2 == 0) && (b % 2 != 0)) || ((a % 2 != 0) && (b % 2 == 0))) {
			System.out.println("result ==> NO");
			check = false;
		} else {
			if (a >= b)
				c = a;
			else
				c = b;
			for (int i = 1; i <= c / 2; i++)
				if (checkPrime(i) == true) {
					if (((a % i == 0) && (b % i != 0)) || ((a % i != 0) && (b % i == 0))) {
						System.out.println("result ==> NO");
						check = false;
						break;
					}
				}
			if (check == true) {
				System.out.println("result ==> YES");
			}
		}
	}
}
