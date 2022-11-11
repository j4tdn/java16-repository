package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arrays = { 1, 2, 3, 4, 3, 1 };
		removeSameNumber(arrays, arrays.length);
		System.out.println("=========");
		int[] array1 = { 1, 2, 3, 4, 3, 1, 6, 9, 5 };
		compareTo(array1);
		findnumbermax3(array1);
	}

	private static void removeSameNumber(int[] array, int number) {
		if (number == 0 || number == 1) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(Arrays.toString(array));
			}
		}
		int[] copyArray = new int[array.length];
		boolean found;
		int count = 0;
		copyArray[0] = array[0];
		count++;
		for (int i = 0; i < array.length; i++) {
			found = false;
			for (int j = 0; j < count; j++) {
				if (copyArray[j] == array[i]) {
					found = true;
					break;
				}
			}
			if (!found) {
				copyArray[count] = array[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(copyArray[i] + " ");
		}
	}

	private static void compareTo(int[] arrays) {
		int[] firstHalf = Arrays.copyOfRange(arrays, 0, arrays.length / 2);
		int[] secondHalf = new int[arrays.length / 2];
		double first = 0;
		double sum1 = 0;
		double second = 0;
		double sum2 = 0;
		if ((arrays.length % 2) != 0) {
			secondHalf = Arrays.copyOfRange(arrays, (arrays.length / 2) + 1, arrays.length);
		} else {
			secondHalf = Arrays.copyOfRange(arrays, arrays.length / 2, arrays.length);
		}
		for (int number : firstHalf) {
			sum1 += number;
		}
		first = sum1 / firstHalf.length;
		for (int number : secondHalf) {
			sum2 += number;
		}
		second = sum2 / secondHalf.length;
		if ((sum1 - sum2) > 0) {
			System.out.println("Average of first n/2 elements is greater than average of last n/2 elements");
		} else {
			System.out.println("Average of first n/2 elements is less than average of last n/2 elements");
		}
	}

	private static void findnumbermax3(int[] arrays) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		Arrays.sort(arrays);
		for (int i = 0; i < arrays.length; i++) {
			for (int j =0; j < arrays.length-i-1; j++) {
				if (arrays[j] < arrays[j+1]) {
					int temp = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i < arrays.length; i++) {
			max = arrays[0];
			if (arrays[0] > arrays[i]) {
				max2 = arrays[i];
				break;
			}	
		}
		for (int j = 0; j < arrays.length; j++) {
			if (max2 > arrays[j]) {
				max3 = arrays[j];
				break;
			}
		}
		System.out.println("max3: " + max3);
	}

}
