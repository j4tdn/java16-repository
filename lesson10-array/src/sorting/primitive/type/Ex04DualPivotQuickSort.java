package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04DualPivotQuickSort {
	public static void main(String[] args) {
		int[] digit = { 1, 5, 11, 9, 4, 6 };
		//dual pivot quick sort 
		//default(unique): ascending
		
		Arrays.sort(digit);
		reverse(digit);
		ArrayUtils.printf("digit", digit);
	}
	
	public static void reverse(int[] elements) {		
		for(int i = 0; i < elements.length/2; i++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length-i-1];
			elements[elements.length-i-1] = tmp;
		}
	}
	
	
}
