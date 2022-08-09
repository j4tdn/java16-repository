package view;

import java.util.Scanner;

public class Ex02SumFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Number " + (i + 1) + ":");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += factorial(a[i]);
		}
		System.out.println("Sum: " + sum);
	}

	public static int factorial(int n) {
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt = gt * i;
		}
		return gt;
	}
}
