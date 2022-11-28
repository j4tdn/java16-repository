package sorting.primtive.basic;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {//dual pivot: dùng quichSort dùng 2 điểm chốt
	public static void main(String[] args) {
		int[] digits = { 1, 5, 11, 9, 4, 6 };
		Arrays.sort(digits);//dùng sort tăng dần của java
		//due pivot quick sort
		//default(unique): asc chỉ hỗ trợ duy nhất sort tăng dần
		reverse(digits);

		ArrayUtils.printf("digist ", digits);
	}
	public static void reverse(int[] elements) {
		for(int i=0;i<elements.length/2;i++) {
			int tmp = elements[i];
			elements[i]= elements[elements.length-i-1];
			elements[elements.length-i-1]=tmp;
		}
	}

}
