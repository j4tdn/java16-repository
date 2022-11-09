package sorting.basic;

import ultis.ArraysUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits= {1,5,9,11,4,6};
		insertionSort(digits);
		ArraysUtils.printf("digits", digits);
		
	}
	private static void insertionSort(int[] ele) {
		for(int round = 1; round < ele.length; round++) {
			for(int i = 0; i < round; i++)
				if(ele[i] > ele[round]) {
					int tmp = ele[i];
					ele[i] = ele[round];
					ele[round] = tmp;
				}
		}
	}

}
