package homework;

import java.util.Scanner;

public class Ex02TotalFactorial {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Bạn muốn nhập bao nhiêu số: ");
		int n = t.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			a[i] = t.nextInt();
		}
		System.out.println("Tổng S = " + sum(a));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += factorial(number);
		}
		return sum;
	}

	private static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
}
