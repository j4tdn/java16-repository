package problem01;

import java.util.Arrays;

public class Ex01ArrayApp {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 1 };

		int[] temp1 = removeDuplicates(arr);
		System.out.println(Arrays.toString(temp1));
		System.out.println("=============");

		int temp2 = isLeftHalfLarger(arr);
		System.out.println("Is Left Half Larger? " + temp2);
		System.out.println("=============");

		int temp3 = findThirdLargest(arr);
		if (temp3 != Integer.MIN_VALUE)
			System.out.println("The third largest: " + temp3);
		else
			System.out.println("Doesn't have the third largest!");
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

	// 1: larger, 0: equal, -1: smaller
	private static int isLeftHalfLarger(int[] arr) {
		int left = 0;
		int right = 0;
		for (int i = 0; i < arr.length / 2; i++)
			left += arr[i];
		for (int i = arr.length - arr.length / 2; i < arr.length; i++)
			right += arr[i];
		if (left == right)
			return 0;
		return (left > right) ? 1 : -1;
	}

	private static int findThirdLargest(int[] arr) {
		int M1 = Integer.MIN_VALUE;
		int M2 = Integer.MIN_VALUE;
		int M3 = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i == M1 || i == M2 || i == M3)
				continue;
			if (M1 < i) {
				M3 = M2;
				M2 = M1;
				M1 = i;
			} else if (M2 < i) {
				M3 = M2;
				M2 = i;
			} else if (M3 < i)
				M3 = i;
		}
		return M3;
	}
}
