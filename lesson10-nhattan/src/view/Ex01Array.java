package view;

import java.util.Random;

import utils.ArrayUtils;

public class Ex01Array {
	private final static int MAX_VALUE = 50;

	public static void main(String[] args) {

		int[] rdArr = randArr(10);
		ArrayUtils.printf("Mảng ban đầu:", rdArr);

		System.out.println("\n======================================");
		rdArr = removeEqualElements(rdArr);
		ArrayUtils.printf("Mảng đã xoá những phần tử trùng nhau:", rdArr);

		System.out.println("\n======================================");
		System.out.println("So sánh giá trị trung bình của n/2 phần tử đầu tiên" 
				+ " với n/2 phần tử cuối cùng:\n" + compareTo(rdArr));

		System.out.println("\n======================================");
		System.out.println("Số lớn thứ 3 trong mảng: " + thirdMax(rdArr));

	}

	private static int[] randArr(int length) {
		int[] randArr = new int[length];
		Random rd = new Random();
		for (int i = 0; i < length; i++) {
			randArr[i] = rd.nextInt(MAX_VALUE);
		}
		return randArr;
	}

	private static int[] removeEqualElements(int[] numbers) {
		int[] key = new int[MAX_VALUE + 1];
		for (int i = 0; i < numbers.length; i++) {
			key[numbers[i]]++;
		}

		int count = 0;
		for (int i = 0; i < key.length; i++) {
			if (key[i] == 1) {
				count++;
			}
		}

		int[] result = new int[count];
		count = 0;
		for (int i = 0; i < key.length; i++) {
			if (key[i] == 1) {
				result[count] = i;
				count++;
			}
		}
		return result;
	}

	private static int compareTo(int[] numbers) {
		int result = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			result += (numbers[i] - numbers[numbers.length - 1 - i]);
		}
		return result;
	}

	private static int thirdMax(int[] a) {
		long[] maxs = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

		for (int i = 0; i < a.length; i++) {
			insert(maxs, a[i]);
		}

		if (maxs[2] == Long.MIN_VALUE) {
			return (int) maxs[0];
		}
		return (int) maxs[2];
	}

	private static void insert(long[] maxs, int val) {
		if (val <= maxs[maxs.length - 1]) {
			return;
		}

		// tìm vị trí cần chèn
		int i = 0;
		while (i < maxs.length) {
			if (val == maxs[i]) {
				return;
			}
			if (val > maxs[i]) {
				break;
			}
			if (val < maxs[i]) {
				// nhảy i để tìm tiếp
				i++;
			}
		}

		// chèn val vào vị trí thứ i
		if (i < maxs.length) {
			for (int j = maxs.length - 2; j >= i; j--) {
				maxs[j + 1] = maxs[j];
			}
			maxs[i] = val;
		}
	}
}
