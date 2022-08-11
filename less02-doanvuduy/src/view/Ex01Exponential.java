package view;

import java.util.Scanner;

public class Ex01Exponential {
	public static void main(String[] args) {
		int number = 0;
		exponnential(number);
	}

	private static void exponnential(int n) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so n:");
		n = ip.nextInt();
		if (Math.sqrt(n) % 2 == 0)
			System.out.println(n + " " + "la luy thua cua 2");
		else
			System.out.println(n + " " + "khong la luy thua cua 2");

	}
}