package view;

import java.util.Scanner;

public class Ex01PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		if (checkPower(a) == false) {
			System.out.println(a + " not Power of 2");
		} else {
			System.out.println(a + " is Power of 2");
		}
	}

	private static boolean checkPower(int n) {
		while (n > 2) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

}
