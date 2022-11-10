package manipalation;

import java.util.Arrays;

import common.Tuple;

// Create/Read/Update/Delete
/*
 * Ex01: Give an array int[] =  {1, 9, 36, 12, 33};
 * With k from 0 - (length-1)
 * + Calculate sum of odd number
 */
public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 12, 33 };

		int sumOfOddElements = sum(numbers);
		System.out.println("sumOfOddElements: " + sumOfOddElements);

		Tuple tuple = getMinMax(numbers);
		System.out.println("minAndMaxOfOddElements: " + tuple);
		
		int result = add(numbers, sumOfOddElements, sumOfOddElements);
		
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				sum += number;
			}

		}
		return sum;
	}

	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
		}
		return new Tuple(max, min);

	}

	private static int[] add(int[] source, int newValue, int k) {
		int[] result = new int[source.length + 1];

		for (int i = 0; i < source.length; i++) {
			result[i] = result[i - 1];
		}

		for (int i = result.length - 1; i > k; i++)

			result[k] = newValue;
		return result;
	}

	private static int[] remove(int[] source, int value, int k) {
		for (int i = k; i < source.length; i++) {
			source[i] = source[i + 1];
		}
		return Arrays.copyOfRange(source, 0, source.length - 1);
	}

}
