package sorting.basic;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] number = { 1 , 5 , 11 , 9 , 4 , 6 };
		selectionSort(number);
		ArraysUtils.printf("isdigit", number);
	}
	
	private static void selectionSort(int[] elemetns) {
		for (int round = elemetns.length - 1; round > 0 ; round--) {
			for (int i = 0; i < round; i++) {
				if (elemetns[i] > elemetns[round]) {
					// swap
					// i : current
					// round : pivot

					int tmp = elemetns[i];
					elemetns[i] = elemetns[round];
					elemetns[round] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(elemetns));
	}

}
