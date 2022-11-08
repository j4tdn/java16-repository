package sorting.basic;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] number = { 1 , 5 , 11 , 9 , 4 , 6 };
		insertionSort(number);
		ArraysUtils.printf("isdigit", number);
	}
	
	private static void insertionSort(int[] elemetns) {
		for (int round = 1; round < elemetns.length ; round++) {
			for (int i = 0; i < round; i++) {
				if (elemetns[round] > elemetns[i]) {
					// swap
					// i : current
					// round : pivot

					int tmp = elemetns[round];
					elemetns[round] = elemetns[i];
					elemetns[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(elemetns));
	}

}
