package ex02SortArray;

import java.util.Scanner;

public class Mainnn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("nhap vao so phan tu cua mang n= ");
		n = sc.nextInt();
		int A[] = new int[n];
		for( int i = 0; i < n ; i++) {
			System.out.println("Nhap cac gia tri cua mang");
			System.out.print("a[" + i + "]= ");
			A[i] = sc.nextInt();
			
		}
		System.out.println("Mang vua nhap");
		for(int i =0; i < n; i++) {
			System.out.print("\t"+A[i]);
		}
		System.out.println("\n mang sau khi sap xep");
		for(int i =0; i< n; i++) {
			sort(A, n);
		}
		
	}
	private static void sort(int A[], int n) {
		for(int i = 0; i < n; i++) {
			if(A[i] % 7 ==0) {
				for(int j = 0; j < n; j++) {
					int temp = A[i];
	                A[i] = A[j];
	                A[j] = temp;
	               
				}
			}
		}
		for(int k = n-1; k >= 0; k--) {
			if(A[k] %5 == 0) {
				for(int j = 0; j < n; j++) {
					int temp = A[k];
	                A[k] = A[j];
	                A[j] = temp;
	                
			    }
			}
		}
	}
}

