package ex02;

import java.util.Random;
import java.util.Scanner;

public class Demoo {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.print("nhap cac so cho mang  ");

		for (int i = 0; i < n; i++) {
			System.out.print("A" +"["+ i+"]= ");
			A[i] = sc.nextInt();
		}
		getMissingNumber(A[], n);
	}
	private static int getMissingNumber(int A[] int n) {
		Random rd = new Random();
		for(int i = 0; i < n ; i++) {
			if(A[i] > i )
				return A[i];
		}
	}
	
}
