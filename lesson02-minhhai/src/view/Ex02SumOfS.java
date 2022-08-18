package view;

import java.util.Scanner;

public class Ex02SumOfS {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println(" Nhap S1:");
		int s1 = ip.nextInt();
		System.out.println(" Nhap S2:");
		int s2 = ip.nextInt();
		System.out.println(" Nhap S3:");
		int s3 = ip.nextInt();
		System.out.println(" Nhap S4:");
		int s4 = ip.nextInt();
		long sum = Factorial(s1) + Factorial(s2) + Factorial(s3) + Factorial(s4);
		System.out.println(" Tong cua S = " + s1 + "! + " + s2 + "! + " + s3 + "! + " + s4 + "! = " + sum);

	}

	private static long Factorial(int s) {
		if (s == 1)
			return 1;
		return s * Factorial(s - 1);
	}
}
