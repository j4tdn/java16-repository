package ex04;

import java.util.Random;
import java.util.Scanner;
public class UniqueNumbers {
	 public static void sortASC(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	        System.out.println();
	        for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.print(arr[i] + " ");
				}
			}
	    }
	private static void getUniqueNumbers(int[] A) {
		int dem = 0;
		for (int j = 0; j < A.length; j++) {
			for (int i = dem + 1; i < A.length; i++) {
				if (A[dem] > 0) {
					if (A[dem] == A[i]) {
						A[i] = 0;
						A[dem] = 0;
					}
				}

			}
			dem++;
		}
	}
	public static void main(String[] args) {
		int A[]= {1,2,2,3,4,4,5};
		getUniqueNumbers(A);
		sortASC(A);
	}
}
