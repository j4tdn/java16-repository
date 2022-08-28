package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số n hệ cơ số 10 là: ");
		int n = sc.nextInt();
		
		System.out.print("Hệ cơ số 2 của n là: ");
		chuyendoi(n);
		
	}
	public static void chuyendoi(int b) {
		int arr[] = new int[100];
		int a = 0;
		while (b > 0) {
			arr[a++] = b%2;
			b = b/2;
		}
		
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}
	}
	
}
