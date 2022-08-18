package view;

import java.util.Scanner;

public class Ex04MaxOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int length = sc.nextInt();
		int[] number = new int[length];
		int max = Integer.MIN_VALUE;
		int countOdd = 0;
		for (int i = 0; i < length; i++) {
			System.out.print("Enter number[" + i + "]: ");
			number[i] = sc.nextInt();
			if (number[i] % 2 == 1) {
				if (number[i] > max)
					max = number[i];
			}
			countOdd++;
		}
		if (countOdd != 0)
			System.out.println("Max odd number: " + max);
		else 
			System.out.println("All numbers here are even");
		sc.close();
	}
}
