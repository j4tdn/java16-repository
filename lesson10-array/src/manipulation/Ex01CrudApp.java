package manipulation;

import java.util.Arrays;

import common.Tuple;

//create/read/update/delete
/*
 * 
 */
public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		System.out.println(sum(numbers));
		Tuple tuple = getMinMax(numbers);
		System.out.println(tuple);

		int[] array = add(numbers, 18, 3);
		System.out.println(Arrays.toString(array));

		int[] newarray = insert(numbers, 77, 2);
		System.out.println(Arrays.toString(newarray));
		
		int[] newRemoveArray = remove(numbers,0);
		System.out.println(Arrays.toString(newRemoveArray));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {// for(int number: numbers)
			if (numbers[i] % 2 != 0) {
				sum = sum + numbers[i];
			}
		}
		return sum;

	}

	private static Tuple getMinMax(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}

		}
		return new Tuple(max, min);

	}

	private static int[] add(int[] source, int value, int k) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			result[i] = source[i];
		}
		result[k] = value;
		for (int i = k + 1; i < result.length; i++) {
			result[i] = source[i - 1];
		}

		return result;
	}

	private static int[] insert(int[] source, int value, int k) {
		int[] result = new int[source.length+1];

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
