package view;

import java.util.Random;
import java.util.Scanner;

public class Ex07Random5Number {
	static Random rd = new Random();

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		input(arr);
		duplicates(arr);
		sort(arr);
		show(arr);
	}

	private static void input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 20 + rd.nextInt(11);
		}
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
	}

	public static void duplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 20 + rd.nextInt(11);
			;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
	}
}
