package sorting.basic;

import ultis.ArraysUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits= {1,5,9,11,4,6};
		selectionSort(digits);
		ArraysUtils.printf("digits", digits);
	}
	private static void selectionSort(int[] ele) {
		for(int round = ele.length - 1; round > 0; round--) {
			for(int i = 0; i < round; i++)
				if(ele[i] > ele[round]) {
					int tmp = ele[i];
					ele[i] = ele[round];
					ele[round] = tmp;
				}
		}
	}

}
