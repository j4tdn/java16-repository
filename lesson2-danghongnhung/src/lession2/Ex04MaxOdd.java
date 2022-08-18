package lession2;

import java.util.Scanner;

public class Ex04MaxOdd {

	public static void main(String[] args) {
		int [] numbers = {5, 1, 9, 11, 20, 19, 17, 21, 30};
		
		
		System.out.println("Max odd: " + findMaxOddElement(numbers));

	}
	
	private static int findMaxOddElement(int[] elements) {
		int max = Integer.MIN_VALUE;
		int countOdd = 0;
		for(int element: elements) {
			if(isOdd(element) && (element > max)) {
				max = element;
				countOdd++;
			}
		}
		if(countOdd == 0) {
			System.out.println("Array has no odd element!!!");
			System.exit(0);
		}
		return max;
	}
	
	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
