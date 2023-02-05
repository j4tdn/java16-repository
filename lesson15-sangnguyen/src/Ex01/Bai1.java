package Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Bai1 {
	public static void main(String[] args) {
		int[] arrayNumbers = arrayNumbersConstructor();
		System.out.println("input: ");
		printArrays(arrayNumbers);
		int[] appearedOnce = appearedOnce(arrayNumbers);
		System.out.println("appearedOnce: ");
		printArrays(appearedOnce);
		int[] appearManyTimes = appearManyTimes(arrayNumbers);
		System.out.println("appearManyTimes: ");
		printArrays(appearManyTimes);
	}
	
	private static int[] appearManyTimes(int[] arrayNumbers) {
		int[] result = new int[100]; int k = 0;
		int[] output = new int[arrayNumbers.length];
		for (int i = 0; i < arrayNumbers.length; i++) {
			result[arrayNumbers[i]]++;
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] > 1) {
				output[k++] = i;
			}
		}
		return Arrays.copyOf(output, k);
	}

	public static int[] appearedOnce (int[] arrayNumbers) {
		int[] result = new int[100]; int k = 0;
		int[] output = new int[arrayNumbers.length];
		for (int i = 0; i < arrayNumbers.length; i++) {
			result[arrayNumbers[i]]++;
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 1) {
				output[k++] = i;
			}
		}
		return Arrays.copyOf(output, k);
	}
	
	public static int[] arrayNumbersConstructor() {
		Random rd = new Random();
		int n = rd.nextInt(10)+10;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = rd.nextInt(10);
		}
		return result;
	}
	
	public static void printArrays(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}
}
