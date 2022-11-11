package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		int sumOfElement = sum(numbers);
		System.out.println("sumOfElement: " + sumOfElement);

		Tuple tuple = getMinMax(numbers);
		System.out.println("tuple: " + tuple);

		int[] newAddedArray = add(numbers, 18, 3);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));

		int[] newInsertArray = insert(newAddedArray, 77, 3);
		System.out.println("newInsertArray: " + Arrays.toString(newInsertArray));

		int[] newRemove = remove(numbers, 2);
		System.out.println("newRemove: " + Arrays.toString(newRemove));

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
		Tuple result = new Tuple(max, min);
		return result;
	}

	private static int[] add(int[] source, int newValue, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < 3; i++) {
			result[i] = source[i];
		}
		result[k] = newValue;
		for (int i = k + 1; i < result.length; i++) {
			result[i] = source[i - 1];
		}
		return result;

	}

	private static int[] insert(int[] source, int newValue, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}
		for (int i = result.length - 1; i > k; i--) {
			result[i] = result[i - 1];
		}
		result[k] = newValue;
		return result;

	}

	private static int[] remove(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}
		return Arrays.copyOfRange(source, 0, source.length - 1);

	}
}
