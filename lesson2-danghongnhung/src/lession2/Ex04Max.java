package lession2;

import java.util.Scanner;

public class Ex04Max {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " +i);
			arr[i] = ip.nextInt();
		}
		
		System.out.println("Số lẻ lớn nhất trong mảng: " + MaxOdd(arr,n));

	}
	private static int MaxOdd(int []arr, int n) {
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if((arr[i] % 2 != 0) && (arr[i] > max))
				max = arr[i];
		}
		return max;
	}
}
