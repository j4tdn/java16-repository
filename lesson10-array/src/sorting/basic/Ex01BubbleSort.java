package sorting.basic;

import ultis.ArraysUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits= {1,5,9,11,4,6};
		bubbleSort(digits);
		ArraysUtils.printf("digits", digits);
	}
	private static void bubbleSort(int[] ele) {
		for(int round = 0; round < ele.length; round++) {
			for(int i = 0; i <ele.length - round - 1; i++)
				if(ele[i] < ele[i+1]) {
					int tmp = ele[i];
					ele[i] = ele[i+1];
					ele[i+1] = tmp;
				}
		}
	}

}
