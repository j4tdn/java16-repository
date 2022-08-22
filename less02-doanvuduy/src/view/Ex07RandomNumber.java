package view;

import java.util.Arrays;
import java.util.Random;

public class Ex07RandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int noDupCount = 0; // số lượng phần tử không trùng nhau đã tạo ra.
		while (noDupCount < numbers.length) {
			int number = 20 + rd.nextInt(11);
			if (!isExist(numbers, number)) {
				numbers[noDupCount++] = number;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

	private static boolean isExist(int[] numbers, int testednumber) {
		for (int number : numbers) {
			if (number == testednumber) {
				return true;
			}
		}
		return false;
	}

}
