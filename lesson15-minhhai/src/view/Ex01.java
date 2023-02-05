package view;

import java.util.Arrays;


public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		System.out.println("Numbers: " + Arrays.toString(numbers));
		System.out.println("=================================");
		System.out.println("Unique number in the Array: ");
		int[] check1 = removeDuplicates(numbers);
		System.out.println(Arrays.toString(check1));
		System.out.println("=============");
		System.out.println("Duplicate number in the Array: ");
		int[] check2 = duplicateNumber(numbers);
		System.out.println(Arrays.toString(check2));
	}

	private static int[] removeDuplicates(int[] arr) {
		if (arr.length == 1 || arr.length == 0)
			return arr;
		int[] result = new int[arr.length];
		int[] arrClone = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrClone);
		int j = 0;
		for (int i = 1; i < arrClone.length - 1; i++)
			if (arrClone[i] != arrClone[i - 1] && arrClone[i] != arrClone[i + 1])
				result[j++] = arrClone[i];
		if (arrClone[arrClone.length - 1] != arrClone[arrClone.length - 2])
			result[j++] = arrClone[arrClone.length - 1];
		return Arrays.copyOfRange(result, 0, j);
	}

	private static int[] duplicateNumber(int[] arr) {
		if (arr.length == 1 || arr.length == 0)
			return arr;
		int[] result = new int[arr.length];
		int[] arrClone = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrClone);
		int j = 0;
		for (int i = 1; i < arrClone.length - 1; i++)
			if (arrClone[i] == arrClone[i - 1])
				result[j++] = arrClone[i];
		if (arrClone[arrClone.length - 1] == arrClone[arrClone.length - 2])
			result[j++] = arrClone[arrClone.length - 1];
		return Arrays.copyOfRange(result, 0, j);
	}
}