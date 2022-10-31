package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println("Sum old arrays = " + sum(numbers));
		Tuple tuple = getMinMax(numbers);
		System.out.println("tuple: " + tuple);

		int[] newAddedArray = add(numbers, 18, 0);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));

		int[] newRemovedArray = remove(newAddedArray, 3);
		System.out.println("newRemovedArray: " + Arrays.toString(newRemovedArray));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sum = sum + numbers[i];
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

	private static int[] add(int[] source, int value, int k) {
		int[] arrays = new int[source.length + 1];
		arrays = Arrays.copyOfRange(source, 0, arrays.length);
		arrays[k] = value;
		for (int i = k + 1; i < arrays.length; i++) {
			arrays[i] = source[i - 1];
		}
		return arrays;
	}

	private static int[] remove(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}

		return Arrays.copyOfRange(source, 0, source.length - 1);
	}

}
