package ex01;

import java.util.Arrays;

public class Ex01CreateArrays {
	public static void main(String[] args) {
//		int[] digits = { 1, 2, 3, 4, 3, 1 };
		int[] digits = { 7, 8, 8, 8, 6, 2, 5, 1 };
		removeDuplicate(digits);
		compareAverageValue(digits);
		findMaxValue3th(digits);
	}

	// a
	private static void removeDuplicate(int[] digit) {
		int[] newdigit = new int[digit.length];
		int index = 0;
		for (int i = 0; i < digit.length; i++) {
			int count = 0;
			for (int j = 0; j < digit.length; j++) {
				if (digit[i] == digit[j]) {
					count += 1;
				}
			}
			if (count == 1) {
				newdigit[index] = digit[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(newdigit, 0, index)));
	}

	// b
	private static void compareAverageValue(int[] digit) {
		int[] pre = Arrays.copyOfRange(digit, 0, digit.length / 2);
		int[] next = Arrays.copyOfRange(digit, digit.length / 2, digit.length);

		double averagepre = 0, averagenext = 0;
		for (int i = 0; i < pre.length; i++) {
			averagepre += pre[i] / (double) pre.length;
		}
		for (int i = 0; i < next.length; i++) {
			averagenext += next[i] / (double) next.length;
		}
		if (averagepre > averagenext) {
			System.out.println("pre:" + averagepre + " > " + "next:" + averagenext);
		} else if (averagepre < averagenext) {
			System.out.println("pre:" + averagepre + " < " + "next:" + averagenext);
		} else {
			System.out.println("pre:" + averagepre + " = " + "next:" + averagenext);
		}
	}

	// c
	private static void findMaxValue3th(int[] digit) {
		int count = 0, index = digit.length-1;
		for (int i = 1; i < digit.length; i++) {
			for (int j = 0; j < i; j++) {
				if (digit[j] > digit[i]) {
					int temp = digit[i];
					digit[i] = digit[j];
					digit[j] = temp;
				}
			}
		}
		for (int i = digit.length-1; i > 0; i--) {
			if(digit[i] > digit[i-1]) {
				count++;
				index--;
			}
			if(digit[i] == digit[i-1]) {
				index--;
			}
			if(count == 2) {
				System.out.println(digit[index]);
			}
		}
	}
}
