package ex02;

import java.util.Random;
import java.util.Scanner;

public class Demoo {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n= ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("nhap cac so cho mang  ");

		for (int i = 0; i < n; i++) {
			System.out.println("A" +"["+ i+"]= ");
			A[i] = rd.nextInt(n)+1;
		}
		System.out.println("mang vua nhap");
		for(int i = 0; i< n; i++) {
			
			System.out.println("\t" + A[i]);
		}
		int t = getMissingNumber(A, n) ;
		System.out.println(t);
}
	private static int getMissingNumber(int A[], int n) {
		for(int i =0; i < n; i++) {
			for(int k =0; k < n; k++) {
				if(A[i] != k) {
					return k;
				}
			}
		}
		return 0;
	}
}
