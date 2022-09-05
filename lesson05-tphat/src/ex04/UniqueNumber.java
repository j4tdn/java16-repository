package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] a = new int[20];
		System.out.println("Enter number: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the numeric element " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
		for (int i = 0; i < n; i++) {
			if (getLeastCommonMultiple(a, n, a[i]) == 1)
				System.out.print("  " + a[i]);
		}
	}

	public static int getLeastCommonMultiple(int a[], int n, int i) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == i)
				count++;
		}
		return count;
	}

}
