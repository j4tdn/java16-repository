package view;

import java.util.Scanner;

public class Ex04LargestOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = ip.nextInt();
		}
		show(arr);
		oddMax(arr);

	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(temp);
	}

	private static void oddMax(int[] arr) {
		//sort(arr);
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("số lẻ lớn nhất là: " + max);
	}
	// Tuple: countOdd, maxOld;
	private static int findMaxOddElement2nd(int[] elements) {
		int max = Integer.MIN_VALUE;
		int countOdd = 0;
		for(int element: elements) {
			if(isOdd(element) && element > max) {
				max = element;
				countOdd++;
			}
		}
		if(countOdd == 0) {
			System.out.println("Array has on odd element !!!");	
			System.exit(0);
		}
		return max;
	}
	private static boolean isOdd(int number) {
		return number % 2 == 0;
	}
}
