package de2;

import java.util.*;

public class bai3 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập số phần tử của mảng n: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		arr = sort(arr) ;
		System.out.println("Dãy số nguyên được xếp theo level tăng dần: ");
		for(int num : arr) {
			System.out.println(num + " ");
		}
	}

	private static int level(int n) {
		Vector<Integer> a = new Vector<Integer>();
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				a.add(i);
		}
		return a.size();
	}

	private static int[] sort(int[] arr) {
		int[] levelOfArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			levelOfArray[i] = level(arr[i]);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (levelOfArray[j] < levelOfArray[i]) {
					int tmp = levelOfArray[j];
					levelOfArray[j] = levelOfArray[i];
					levelOfArray[i] = tmp;

					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		return arr;
	}
}
