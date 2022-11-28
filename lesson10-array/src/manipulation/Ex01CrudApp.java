package manipulation;

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

		System.out.println("Sum of Odd Element: " + sum(numbers));
		System.out.println("Max -  min:  " + getMinMax(numbers).getLeft() + " - " + getMinMax(numbers).getRight());
		Tuple tuple = getMinMax(numbers);
		System.out.println("Tuple: " + tuple);
		System.out.println("newAddArrays: " + Arrays.toString(add(numbers, 30, 4)));
		System.out.println("newInsertArray: " + Arrays.toString(insert(numbers, 30, 4)));
		// System.out.println("newRemoveArray: " + Arrays.toString(remove(numbers, 2)));

		System.out.println("newDeleteArray: " + Arrays.toString(delete(numbers, 2)));

	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 != 0)
				sum += number;
		}
		return sum;
	}

	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > max)
				max = number;
			if (number < min)
				min = number;
		}
		return new Tuple(max, min);
	}

	private static int[] add(int[] source, int value, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < source.length + 1; i++) {
			if (i < k)
				result[i] = source[i];
			if (i > k)
				result[i] = source[i - 1];
		}
		result[k] = value;
		return result;

	}

	private static int[] insert(int[] source, int value, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}

		for (int i = result.length - 1; i > k; i--) {
			result[i] = source[i - 1];
		}
		result[k] = value;
		return result;

	}

	private static int[] delete(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++)
			source[i] = source[i + 1];

		return Arrays.copyOfRange(source, 0, source.length - 1);
	}
}