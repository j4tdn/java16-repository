package view;

import java.util.Random;
import java.util.Scanner;

public class RemainingInteger {
	static Random rd = new Random();
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		input(arr);
		duplicates(arr);
		show(arr);
		findMissing(arr,n);
	}
	private static void input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + rd.nextInt(10);
		}
	}
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void duplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + rd.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
	}
	 public static void findMissing(int arr[], int n)
	    {
	        int i;
	        int temp[] = new int[n + 1];
	        for (i = 0; i <= n; i++) {
	            temp[i] = 0;
	        }
	 
	        for (i = 0; i < n; i++) {
	            temp[arr[i] - 1] = 1;
	        }
	 
	        int rs = 0;
	        for (i = 0; i <= n; i++) {
	            if (temp[i] == 0)
	                rs = i + 1;
	        }
	        System.out.println("\n"+ rs);
	    }
}
