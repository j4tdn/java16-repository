package manipulation;

import java.util.Arrays;

import common.Tuple;

// Create/Read/Update/Delete
public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		int sumOfOddElements = sum(numbers);
		System.out.println(sumOfOddElements);
		System.out.println(getMinMax(numbers));
		System.out.println("newAddedArray: " + Arrays.toString(add(numbers, 10, 2)));
		System.out.println("insertedArray: " + Arrays.toString(insert(numbers, 77, 2)));
		System.out.println("removedArray:" + Arrays.toString(remove(numbers, 2)));
		System.out.println("deletedArray:" + Arrays.toString(delete(numbers, 2)));
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}
	
	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
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
		
		for (int i = k; i < source.length; i++) {
			result[i + 1] = source[i];
		}
		
		return result;
	}
	
	private static int[] insert(int[] source, int value, int k) {
		int[] result = new int[source.length + 1];
		
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
//		int[] result = new int[source.length - 1];
//		for (int i = 0; i < k; i++) {
//			result[i] = source[i];
//		}
//		for (int i = k; i < result.length; i++) {
//			result[i] = source[i + 1];
//		}
//		return result;
		
		int[] result = new int[source.length - 1];
		int curIndex = 0;
		for (int i = 0; i < source.length; i++) {
			if (i == k) {
				i++;
			}
			result[curIndex] = source[i];
			curIndex++;
		}
		return result;
	}
	
	private static int[] delete(int[] source, int k) {
		for (int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}
		return Arrays.copyOf(source, source.length - 1);
	}
}
