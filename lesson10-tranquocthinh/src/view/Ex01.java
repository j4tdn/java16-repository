package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 3, 1 };

		System.out.println(Arrays.toString(removeDuplicateElements(a)));
		System.out.println("==============================================================");

		a = new int[] { 1, 2, 3, 4, 5, 6 };
		if (compareTo(a) > 0) {
			System.out.println("Giá trị TB của n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối đầu");
		} else if (compareTo(a) < 0) {
			System.out.println("Giá trị TB của n/2 phần tử đầu tiên bé hơn n/2 phần tử cuối đầu");
		} else {
			System.out.println("Giá trị TB của n/2 phần tử đầu tiên bằng n/2 phần tử cuối đầu");
		}
		System.out.println("==============================================================");

		a = new int[] { 2, 1, 4, 7, 9, 12 };
		System.out.println("Số lớn thứ 3 trong mảng là: " + findNumberThridInArrays(a));

	}

	private static int[] removeDuplicateElements(int[] numbers) {
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

	private static int compareTo(int[] numbers) {
		int k = numbers.length / 2;

		int sumLeft = 0, sumRight = 0;
		for (int i = 0; i < k; i++) {
			sumLeft += numbers[i];
			sumRight += numbers[numbers.length - i - 1];
		}
		return (sumLeft - sumRight) / k;
	}

	private static int findNumberThridInArrays(int[] numbers) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max1) {
				max1 = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max2 && numbers[i] != max1) {
				max2 = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max3 && numbers[i] != max1 && numbers[i] != max2) {
				max3 = numbers[i];
			}
		}

		return max3;
	}
}
