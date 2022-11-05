package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
//	Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33};
//	With k from 0 - (length-1)
//	+ Calculate sum of odd numbers 
//	+ Find max, min in one loop
//
//	+ Add element at index k
//	+ Remove element from index k
//	+ Update element at index k
//	+ Get element at index k
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println("Sum of odd elements: " + sum(numbers));
		Tuple minMax = getMinMax(numbers);
		System.out.println("Min: " + minMax.getLeft());
		System.out.println("Max: " + minMax.getRight());
		numbers = add(numbers, 9999, 2);
		System.out.println("After add: " + Arrays.toString(numbers));
		numbers = remove(numbers, 2);
		System.out.println("After add: " + Arrays.toString(numbers));
		numbers = update(numbers, -1231923, 0);
		System.out.println("After add: " + Arrays.toString(numbers));
		System.out.println("Get element 0th: " + intAt(numbers, 0));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers)
			if (i % 2 != 0)
				sum += i;
		return sum;
	}

	private static Tuple getMinMax(int[] numbers) {
		Tuple result = new Tuple(Integer.MAX_VALUE, Integer.MIN_VALUE);// min-left, max-right
		for (int i = 0; i < numbers.length; i++) {
			if (result.getLeft() > numbers[i])
				result.setLeft(numbers[i]);
			if (result.getRight() < numbers[i])
				result.setRight(numbers[i]);
		}
		return result;
	}

	private static int[] add(int[] source, int value, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < k; i++)
			result[i] = source[i];
		result[k] = value;
		for (int i = k + 1; i < result.length; i++)
			result[i] = source[i - 1];
		return result;
	}

	private static int[] remove(int[] source, int k) {
		int[] result = new int[source.length - 1];
		for (int i = 0; i < k; i++)
			result[i] = source[i];
		for (int i = k + 1; i < source.length; i++)
			result[i - 1] = source[i];
		return result;
	}

	private static int[] update(int[] source, int value, int k) {
		int[] result = new int[source.length];
		for (int i = 0; i < k; i++)
			result[i] = source[i];
		result[k] = value;
		for (int i = k + 1; i < source.length; i++)
			result[i] = source[i];
		return result;
	}

	private static int intAt(int[] source, int k) {
		return source[k];
	}
}
