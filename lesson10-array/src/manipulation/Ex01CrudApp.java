package manipulation;

import java.util.Arrays;

import common.Tuple;

/*
 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33};
   With k from 0 - (length-1)
+ Calculate sum of odd numbers 
+ Find max, min in one loop
+ Add element at index k
+ Remove element from index k
+ Update element at index k
+ Get element at index k
 */

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println(numbers.equals(numbers));
		System.out.println("sum = " + sumOddElements(numbers));
		System.out.println("min = " + findMinMax(numbers).getLeft());
		System.out.println("max = " + findMinMax(numbers).getRight());
		System.out.println("element at index k = " + getElement(numbers, 3));
		System.out.println(Arrays.toString(add(numbers, 7, 3)));
		System.out.println(Arrays.toString(insert(numbers, 7, 3)));
		System.out.println(Arrays.toString(remove(numbers, 3)));
		System.out.println(Arrays.toString(delete(numbers, 3)));
		System.out.println(Arrays.toString(update(numbers, 11, 3)));
	}

	private static int sumOddElements(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 == 1)
				sum += number;
		}
		return sum;
	}

	private static void sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	private static Tuple findMinMax(int[] numbers) {
		if (numbers.length < 1) {
			return null;
		}
		int[] copiedNumbers = new int[numbers.length];
		for(int i = 0; i< numbers.length; i++) {
			copiedNumbers[i] = numbers[i];
		}
		sort(copiedNumbers);
		return new Tuple(copiedNumbers[0], copiedNumbers[copiedNumbers.length - 1]);
	}

	private static int[] add(int[] source, int value, int k) {
		int[] newArr = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			newArr[i] = source[i];
		}
		newArr[k] = value;
		for (int i = k + 1; i < newArr.length; i++) {
			newArr[i] = source[i - 1];
		}
		return newArr;
	}
	
	private static int[] insert(int[] source, int value, int k) {
		int[] newArr = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			newArr[i] = source[i];
		}
		for (int i = k + 1; i < newArr.length; i++) {
			newArr[i] = source[i - 1];
		}
		newArr[k] = value;
		return newArr;
	}
	
	private static int[] remove(int[] source, int k) {
		if (source.length < 1) {
			return null;
		}
		int[] newArr = new int[source.length - 1];
		for (int i = 0; i < k; i++) {
			newArr[i] = source[i];
		}
		for (int i = k; i < source.length-1; i++) {
			newArr[i] = source[i+1];
		}
		return newArr;
	}
	
	private static int[] delete(int[] source, int k) {
		for (int i = k; i < source.length-1; i++) {
			source[i] = source[i+1];
		}
		return Arrays.copyOfRange(source, 0, source.length-1);
	}
	
	private static int[] update(int[] source, int value, int k) {
		if (source.length < 1) {
			return null;
		}
		int[] newArr = new int[source.length];
		for (int i = 0; i < k; i++) {
			newArr[i] = source[i];
		}
		newArr[k] = value;
		for (int i = k+1; i < source.length; i++) {
			newArr[i] = source[i];
		}
		return newArr;
	}
	
	private static int getElement(int[] numbers, int k) {
		return numbers[k];
	}
}
