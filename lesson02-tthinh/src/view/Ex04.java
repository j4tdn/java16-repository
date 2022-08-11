package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter your array number: ");
			n = Integer.parseInt(ip.nextLine());
		} while (n <= 0);

		int[] digits = new int[n];

		System.out.println("===Enter your number===");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter your number " + (i + 1) + " : ");
			digits[i] = Integer.parseInt(ip.nextLine());
		}
		System.out.println("======Your number=====");
		for (Integer items : digits) {
			System.out.println(items);
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (checkOddNumber(digits[i]) == true) {
				if (max < digits[i]) {
					max = digits[i];
				}
			}
		}
		System.out.println("Max even number in array " + max);
	}

	public static boolean checkOddNumber(int n) {
		return (n % 2 != 0);
	}
}
