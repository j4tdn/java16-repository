package homework;

import java.util.Scanner;

public class Ex04OddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			array[i] = sc.nextInt();

			
			if (array[i] % 2 == 1) {
				max = array[i];
			}
			
		}
		System.out.println("Số lẻ lớn nhất là: " + max);
	}

}
