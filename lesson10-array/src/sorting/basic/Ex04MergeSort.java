package sorting.basic;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex04MergeSort {
	public static void main(String[] args) {
		int[] number = { 1 , 5 , 11 , 9 , 4 , 6 };
		reverse(number);
		ArraysUtils.printf("isdigit", number);
		
	}
	public static void reverse(int[] elements) {
		for(int i = 0; i < elements.length; i ++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length - i - 1];
			elements[elements.length -i -1] = tmp;
		}
	}

}
