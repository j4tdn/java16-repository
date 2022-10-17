package ex01;

import java.util.Arrays;

public class Ex01_CommonElement {
	public static void main(String[] args) {
		int[] a = {2, 8 ,9 ,1, 6};
		int[] b = {2, 1, 1, 8, 9};
		
		System.out.println(Arrays.toString(commonElement(a, b)));
	}
	
	private static int[] commonElement(int[] a, int [] b) {
		int[] result = new int[a.length];
		int curIndex = -1;
		int[] key = new int[40];
		
		for (int i = 0; i < a.length; i++) {
			if (key[a[i]] == 0) {
				key[a[i]]++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			if (key[b[i]] == 1) {
				curIndex++;
				result[curIndex] = b[i];
				key[b[i]]--;
			}
		}
		
		int[] realResult = Arrays.copyOf(result, curIndex + 1);
		Arrays.sort(realResult);
		return realResult;
	}
	
}
