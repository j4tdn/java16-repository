package Manipulation;

import java.util.Arrays;

import common.Tuple;

/*
 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33}; With k from 0 - (length-1)
 * + Calculate sum of odd numbers + Find max, min in one loop
 * 
 * + Add element at index k + Remove element from index k + Update element at
 * index k + Get element at index k
 */
public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		sum(numbers);
		Tuple tuple = getMinMax(numbers);
		System.out.println(tuple);
		int[] addArray = add(numbers, 3, 18);
		System.out.println("AddArray:" + addArray);
		int[] newRemoveArray = remove(numbers, 0);
		System.out.println("New Remove Array:" + newRemoveArray);

	}

	private static int sum(int[] numbers) {
		int sumof = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sumof += numbers[i];
			}

		}
		System.out.println(sumof);
		return sumof;
	}

	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		Tuple tp = new Tuple(max, min);

		return tp;
		// return new Tuple(max,min);
	}

	private static int[] add(int[] source, int k, int value) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			result[i] = source[i];
		}
		result[k] = value;
		for (int i = k + 1; i < source.length; i++) {
			result[i] = source[i - 1];
		}
		return result;
	}

	private static int[] insert(int[] source, int k, int value) {
		int result[] = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}
		for (int i = result.length - 1; i > k; i--) {
			result[i] = result[i - 1];
		}
		result[k] = value;
		return result;
	}

	private static int[] remove(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}
		return Arrays.copyOfRange(source, 0, source.length - 1);
	}

}
