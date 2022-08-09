package view;

import java.util.Scanner;

public class Ex04IsMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Number " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		System.out.println("Largest odd number: " + isMax(arr, n));
	}

	public static boolean isCheck(int n) {
		if (n % 2 == 0)
			return false;
		return true;
	}

	public static int isMax(int a[], int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max && isCheck(a[i])) {
				max = a[i];
			}
		}
		return max;
	}

}
