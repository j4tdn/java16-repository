package homework;

import java.util.Scanner;

public class Ex04OddNumber {
	
	
	public static void main(String[] args) {
		int [] numbers = {4,16,22,47,6,0} ;
		System.out.println("max odd: " + findMaxOdd(numbers));
		
	}
	//Tuple: coundOdd, maxOdd
	private static int findMaxOdd(int[] elements) {
		int max = Integer.MIN_VALUE;
		int countOdd= 0;
		
		for (int element: elements) {
			if (isOdd(element) && element > max) {
				max = element;
				countOdd++;
			}
			if (countOdd == 0) {
				System.out.println("Array has no Odd element!");
				System.exit(0);
			}
		}
		return max;
	}
	private static boolean isOdd(int number) {
		return number % 2 !=0;
	}
	/*
	 * public static void main(String[] args) {
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
	 */

	

}
