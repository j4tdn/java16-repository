package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr1 = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		System.out.println(Arrays.toString(findArrs(arr1)));
	}
	
	public static int[] findArrs(int[] arr) {
		int []tmp = new int[arr.length];
		int count = 0;
		// arr[i] % 7
		for (int i = 0; i < tmp.length; i++) {
			if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				tmp[count++] = arr[i];
			}
		}
		
		for (int i = 0; i < tmp.length; i++) {
			if((arr[i] % 7 == 0 && arr[i] % 5 == 0) || (arr[i] % 7 != 0 && arr[i] % 5 != 0) ) {
				tmp[count++] = arr[i];
			}
		}
		// arr[i] % 5
		for (int i = 0; i < tmp.length; i++) {
			if(arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				tmp[count++] = arr[i];
			}
		}
		return tmp;
	}

}
