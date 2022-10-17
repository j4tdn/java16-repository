package ex03;

import java.util.Arrays;

public class Ex03_LevelNumber {
	public static void main(String[] args) {
		int[] a = {8, 5, 9, 20};
		System.out.println(Arrays.toString(sortToLevel(a)));
	}
	
	private static int[] sortToLevel(int[] numbers) {
		int n = numbers.length;
		
		// bubble sort
		for (int i = 0; i < n - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n-i-1; j++) {
				if (levelNumber(numbers[j]) > levelNumber(numbers[j + 1])) {
					isSorted = false;
					int t = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = t;
				}
			}
			if (isSorted) {
				break;
			}
		}
		
		return numbers;
	}
	
	private static int levelNumber(int number) {
		int level = 0;
		for (int i = 1; i <= number; i++) {
			if (isCommonDivisor(i, number)) {
				level++;
			}
		}
		return level;
	}
	
	private static boolean isCommonDivisor(int div, int number) {
		return number % div == 0;
	}
}
