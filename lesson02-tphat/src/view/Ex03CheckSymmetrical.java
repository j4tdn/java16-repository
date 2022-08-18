package view;

import java.util.Scanner;

public class Ex03CheckSymmetrical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		if (checkSymmertrical(n) == true) {
			System.out.println(n + " is sysmmertrical number");
		} else {
			System.out.println(n + " not sysmmertrical number");
		}
	}

	public static boolean checkSymmertrical(int n) {
		int s = 0, x = n;
		while (x > 0) {
			s = s * 10 + x % 10;
			x = x / 10;
		}
		if (s == n) {
			return true;
		} else {
			return false;
		}
	}

}
