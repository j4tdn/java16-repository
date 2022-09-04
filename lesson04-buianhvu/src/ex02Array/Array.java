package ex02Array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n= ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int temp;
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] % 7 == 0 && arr[i] % 5 == 0) || (arr[i] % 7 != 0 && arr[i] % 5 != 0)) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
