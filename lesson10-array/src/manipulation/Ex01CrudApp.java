package manipulation;

import java.applet.AppletStub;
import java.util.Arrays;

import common.Tuple;

/*
Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33}; With k from 0 - (length-1)
+ Calculate sum of odd numbers 
+ Find max, min in one loop
+ Add element at index k 
+ Remove element from index k 
+ Update element at index k 
+ Get element at index k
*/
public class Ex01CrudApp {
	// Create/ Read/ Update/ Delete
	public static void main(String[] args) {
		int numbers[] = { 1, 9, 5, 36, 12, 33 };
		int sumOfOddNumbers = sum(numbers);
		System.out.println("sum of odd numbers: " + sumOfOddNumbers);
		System.out.println("==============");

		Tuple FindMinMax = getMinMax(numbers);
		System.out.println("Max, min in one loop: " + FindMinMax);
		System.out.println("==============");

		int[] newAddValue = add(numbers, 18, 3);
		System.out.println("newAddValue: " + Arrays.toString(newAddValue));
		newAddValue = insert(newAddValue, 12, 2);
		System.out.println("newAddValue: " + Arrays.toString(newAddValue));
		System.out.println("==============");
		int[] newRemoveValue = remove(numbers, 0);
		System.out.println("newRemoveValue: " + Arrays.toString(newRemoveValue));
	}

	private static int sum(int[] numbers) {
		int sumAll = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				sumAll += number;
			}
		}
		return sumAll;
	}

	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		Tuple result = new Tuple(max, min);
		return result;
	}
     //C1
	private static int[] add(int[] source, int value, int k) {
		int[] results = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			results[i] = source[i];	
		}
		results[k] = value;
		for (int i = k + 1; i < results.length; i++) {
			results[i] = source[i - 1];
		}
		return results;
	}
	//C2 insert
	private static int[] insert(int[] source, int value, int k) {
		int[] results = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			results[i] = source[i];
		}
		for (int i = results.length-1; i > k; i--) {
			results[i] = results[i-1];
		}
		results[k] = value;
		return results;
	}

	private static int[] remove(int[] source, int k) {
		for (int i = k ; i < source.length-1; i++) {
			source[i] = source[i + 1];
		}
		
		return Arrays.copyOfRange(source, 0, source.length-1);
	}

}
