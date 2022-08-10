package view;

import java.util.Scanner;

/**
 * 	Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ
	lớn nhất trong dãy số và in ra.
	Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết quả : 21
 */

public class Ex04MaxOdd {
	public static void main(String[] args) {
		/*	Thao tác nhập
		Scanner ip = new Scanner(System.in);
		int n;
		
		System.out.println("Nhập n số nguyên từ bàn phím.");
		System.out.println("Nhập n: ");
		n = ip.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ip.nextInt();
				
		}
		*/
		System.out.println(maxOdd(5, 1, 9, 11, 20, 19, 17, 21, 30));
	}
	
	private static int maxOdd(int ... numbers) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (isOdd(numbers[i]) && max < numbers[i]) {
					max = numbers[i];
			}
		}
		return max;
	}
	
	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
