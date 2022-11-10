package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	// Create/Read/Update/Delete

	/**
	 * 
	 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33}; With k from 0 - (length-1)
	 * + Calculate sum of odd numbers + Find max, min in one loop
	 * 
	 * + Add element at index k + Remove element from index k + Update element at
	 * index k + Get element at index k
	 */
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		int sumOfOddElement = sum(numbers);
		System.out.println(sumOfOddElement);
		System.out.println("=============================================");

		Tuple tuple = getMinMax(numbers);
		System.out.println(tuple);
		System.out.println("=============================================");

		int[] newAddedArray = add(numbers, 18, 3);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));
		System.out.println("=============================================");

		int[] newInserteddArray = add(newAddedArray, 77, 2);
		System.out.println("newInserteddArray: " + Arrays.toString(newInserteddArray));
		System.out.println("=============================================");
		
		int[] newRemoveddArray = remove(numbers, 2);
		System.out.println("newRemoveddArray: " + Arrays.toString(newRemoveddArray));

	}

	private static int sum(int[] numbers) {
		int total = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				total += number;
			}
		}
		return total;
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
		return new Tuple(max, min);
	}

	private static int[] add(int[] source, int newValue, int k) {
		int[] resutl = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			resutl[i] = source[i];
		}
		resutl[k] = newValue;
		for (int i = k + 1; i < resutl.length; i++) {
			resutl[i] = source[i - 1];
		}
		return resutl;
	}

	private static int[] insert(int[] source, int newValue, int k) {
		int[] resutl = new int[source.length + 1];

		for (int i = 0; i < source.length; i++) { // copy toàn bộ từ mảng cũ qua mảng mới
			resutl[i] = source[i];
		}
		for (int i = resutl.length - 1; i > k; i--) {
			resutl[i] = resutl[i - 1];
		}

		resutl[k] = newValue;
		return resutl;
	}

	private static int[] remove(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}
		return Arrays.copyOfRange(source, 0, source.length - 1);
	}
}
