package ex01;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		int[] arrays = getArrays();
		System.out.println("input: "); 
		printf(arrays);
		System.out.println("=====================");
		
		System.out.println("remove Duplicate Elements: "); 
		printf(removeDuplicateElements(arrays));
		System.out.println("=====================");
		
		System.out.println("differences between top and bot: " + compareArrays(arrays));
		System.out.println("=====================");
		
		if (thirdLargestElementOfArrays(arrays) != -100) {
			System.out.println("Third Largest Elements Of Arrays: " + thirdLargestElementOfArrays(arrays));
		} else {
			System.out.println("Arrays has no 3rd largest element");
		}
		

	}
	
	public static int[] removeDuplicateElements(int[] arrays) {
		boolean[] check = new boolean[100];
		for (int i = 0; i < check.length; i++) {
			check[i] = true;
		}
		int[] beforeArrays = new int[arrays.length];
		int k = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (check[arrays[i]+30] == true) {
				check[arrays[i]+30] = false;
				beforeArrays[k++] = arrays[i];
			}
		}
		return Arrays.copyOfRange(beforeArrays, 0, k);
	}
	
	public static int compareArrays(int[] arrays) {
		int top = 0, bot = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (i <= arrays.length/2) {
				top += arrays[i];
			} else {
				bot += arrays[i];
			}
		}
		return top - bot;
	}
	
	public static int thirdLargestElementOfArrays(int[] arrays) {
		int third = -100, second = -100, first = -100;
		for(int i = 0; i < arrays.length; i++) {
			if (arrays[i] >= first) {
				third = second;
				second = first;
				first = arrays[i];
			} else 
				if (arrays[i] >= second) {
					third = second;
					second = arrays[i];
				} else
					if (arrays[i] >= third) {
						third = arrays[i];
					}
		}
		return third;
	}
	
	public static int[] getArrays() {
		Random rd = new Random();
		int n = rd.nextInt(19)+1;
		int[] arrays = new int[n];
		for (int i = 0; i < n; i++) {
			arrays[i] = rd.nextInt(100)-30;
		}
		return arrays;
	}
	public static void printf(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}
}
