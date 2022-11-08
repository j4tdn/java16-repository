package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04MergeSort {
	public static void main(String[] args) {
		int[] didits = {1, 5, 11, 9, 4, 6};
		Arrays.sort(didits);
		revert(didits);
		ArrayUtils.printf("didits", didits);
	}
	
	public static void revert(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			int tmp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = tmp;
		}
	}
}
