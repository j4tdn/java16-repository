package view;

import java.util.Scanner;

public class Ex04CheckLargestOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number of arrays: ");
		int numbers = ip.nextInt();
		int[] Array = new int[numbers];

		for (int i = 0; i < numbers; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			Array[i] = ip.nextInt();
		}

		System.out.println("the largest and is the odd number is: " + checkLargestOddNumber(Array));

	}

	private static int checkLargestOddNumber(int[] Array) {
		int max = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] % 2 != 0) {
				if (Array[i] > max) {
					max = Array[i];
				}
			}
		}
		return max;
	}
}
