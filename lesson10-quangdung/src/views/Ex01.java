
package views;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] origin = { 1, 3, 4, 4, 2, 3, 2, 7, 5, 6, 5, 7 };

		int[] result = removeDupl(origin);

		for (int r : result) {
			System.out.print(r + " ");
		}
		System.out.println("\n============");

		compare(origin);

		System.out.println("\n============");

		System.out.println("Max third number is " + getNum(origin, 3));
	}

	private static int[] removeDupl(int[] arr) {
		int count = 0;
		int[] result = new int[arr.length];
		Arrays.sort(arr);

		if (arr[0] != arr[1])
			result[count++] = arr[0];

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == arr[i - 1])
				continue;
			else if ((arr[i] != arr[i - 1]) && (arr[i] != arr[i + 1]))
				result[count++] = arr[i];
		}

		if (arr[arr.length - 1] != arr[arr.length - 2])
			result[count++] = arr[arr.length - 1];

		return Arrays.copyOfRange(result, 0, count);
	}

	private static void compare(int[] arr) {
		int sumStAvg = 0;
		int sumNdAvg = 0;
		for (int i = 0; i <= arr.length / 2; i++) {
			sumStAvg += arr[i];
		}
		sumStAvg = sumStAvg / (arr.length / 2);

		for (int i = arr.length / 2 + 1; i < arr.length; i++)
			sumNdAvg += arr[i];

		sumNdAvg = sumNdAvg / (arr.length - arr.length / 2);

		if (sumStAvg == sumNdAvg)
			System.out.println(sumStAvg + " = " + sumNdAvg);
		else if (sumStAvg > sumNdAvg)
			System.out.println(sumStAvg + " > " + sumNdAvg);
		else
			System.out.println(sumStAvg + " < " + sumNdAvg);

	}

	private static int getNum(int[] origin, int pos) {
		int num = 0;
		int count = 1;
		Arrays.sort(origin);
		for (int i = origin.length - 1; i > 0; i--) {
			if (origin[i] == origin[i - 1])
				continue;
			else
				count++;

			if (count == pos) {
				num = origin[i - 1];
				break;
			}
		}

		return num;
	}
}
