package homework;

import java.util.Scanner;

public class Ex04LargestOddNumber {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Bạn muốn nhập bao nhiêu số: ");
		int n = t.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			a[i] = t.nextInt();
		}

		System.out.println("Số lẻ lớn nhất trong dãy số là: " + checkOddNumber(a, n));
	}

	private static int checkOddNumber(int a[], int n) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0 && a[i] > max)
				max = a[i];
		}
		return max;
	}
}
