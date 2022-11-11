package view;

import java.util.Arrays;

import bean.ArrayUtils;

public class Ex01ArrayRandomNumber {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		
		Arrays.sort(numbers);
		ArrayUtils.printf("numbers", numbers);
		
		System.out.println("Removed: " + Arrays.toString(remove(numbers)));
		System.out.println("=======================");
		
		// sum1: gia tri trung binh n/2 phan tu dau tien
		// sum2: gia tri trung binh n/2 phan tu cuoi cung
		if (average(numbers) > 0) {
			System.out.println("sum1 > sum2");
		} else if (average(numbers) < 0) {
			System.out.println("sum1 < sum2");
		} else {
			System.out.println("sum1 = sum2");
		}
		
		System.out.println("=======================");
		
		System.out.println("the third max of array: " + thirdMaxOfArray(numbers));
	}
	
	private static int[] remove(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[k++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	private static int average(int[] numbers) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < numbers.length/2; i++) {
			sum1 += numbers[i];
			sum2 += numbers[numbers.length - i - 1];
		}
		
		return (sum1 - sum2)/(numbers.length/2);
	}
	
	private static int thirdMaxOfArray(int[] numbers) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (max1 < numbers[i]) {
				max1 = numbers[i];
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (max2 < numbers[i] && numbers[i] != max1) {
				max2 = numbers[i];
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (max3 < numbers[i] && numbers[i] != max2 && numbers[i] != max1) {
				max3 = numbers[i];
			}
		}
		return max3;
	}
}
