package ex3_horsesaddle;

import java.util.Random;
import java.util.Scanner;

public class Ex03HorseSaddle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("nhap so cot (M): ");
		int m = input.nextInt();
		System.out.println("nhap so hang (N): ");
		int n = input.nextInt();
		
		Random rd = new Random();
		int A[][] = new int[n][m+1];
		
		System.out.println("Mang ngau nhien co kich thuoc (" + m + "," + n + ") la:");
		 for (int i = 0; i < n; i++) {
			 A[i][m] = 99;
			 for (int j = 0; j < m; j++) {
				 A[i][j] = rd.nextInt(99) + 1;
				 System.out.print("  " + A[i][j]);
				 
				 if (A[i][j] <= A[i][m]) {
					 A[i][m] = A[i][j];
				 }
			 }
			 System.out.println();
		 }
		 //
		int indexOfResultArray = 0;
		int ResultArray[] = new int[m*n+1];
		 for (int i = 0; i < n; i++) {
			 for (int j = 0; j< m; j++) {
				 if (A[i][j] == A[i][m]) {
					 int kt = 0;
					 for (int k = 0; k < n; k++) {						
						 if (A[k][j] > A[i][j]) {
							 kt = 1;
							 break;
						 }
						 }
					 if (kt == 0) {
						 ResultArray[indexOfResultArray+1] = A[i][j];
						 indexOfResultArray++;
					 }
				 }
			 }	 
		 }
		if (indexOfResultArray == 0) {
			System.out.println("Mang tren khong co phan tu nao la phan tu yen ngua !");
		}
		else {
			System.out.println("Bang tren co " + indexOfResultArray + " phan tu yen ngua la: ");
			for (int i = 1; i <= indexOfResultArray; i++) {
				System.out.print("  " + ResultArray[i]);
			}
		}
		 
	}
}
