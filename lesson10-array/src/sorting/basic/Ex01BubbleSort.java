package sorting.basic;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] number = { 1 , 5 , 11 , 9 , 4 , 6 };
		bubbleSort(number);
		ArraysUtils.printf("isdigit", number);
	}
	
	private static void bubbleSort(int[] elemetns) {
		for (int round = 0; round < elemetns.length; round++) {
			for (int i = 0; i < elemetns.length - round - 1; i++) {
				if (elemetns[i] < elemetns[i + 1]) {
					// swap

					int tmp = elemetns[i];
					elemetns[i] = elemetns[i + 1];
					elemetns[i + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(elemetns));
	}

}
