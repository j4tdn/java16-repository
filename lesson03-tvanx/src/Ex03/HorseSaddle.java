package Ex03;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

//		int[][] hs = { { 36, 47, 36 }, 
//				   	   { 36, 43, 36 }, 
//				   	   { 46, 7, 29 } };

//		int[][] hs = { { 10, 10 }, 
//					   { 10, 10 }};

//		int[][] hs = { { 10, 10 }, 
//					   { 15, 15 }};

//		int[][] hs = { { 10, 10 }, 
//					   { 5, 5 }};

//		int[][] hs = { { 3, 3, 3 }, 
//	   	   			   { 3, 3, 3 }, 
//	   	   			   { 2, 2, 2 } };

		int[][] hs = { { 2, 2, 2 }, 
					   { 3, 3, 3 }, 
					   { 3, 3, 3 } };

//		int[][] hs = { { 2, 2, 2 }, 
//				   	   { 2, 3, 3 }, 
//				   	   { 2, 3, 3 } };
		
//		int[][] hs = { { 3, 3, 4 }, 
//	   	   			   { 3, 3, 4 }, 
//	   	   			   { 2, 3, 3 } };

// Enter M rows and N columns then generates the elements of the array as random numbers [1-99]
/*		System.out.print("Enter Rows: ");
		int row = ip.nextInt();
		System.out.print("Enter Columns: ");
		int cl = ip.nextInt();
		int[][] hs = new int[row][cl];

		
		 Random rd = new Random(); for(int i=0;i<row;i++) { for(int j=0;j<cl;j++) {
		 hs[i][j]=1+rd.nextInt(99); System.out.print(hs[i][j]+" "); }
		 System.out.println(); }
*/
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(hs[i][j] + " ");
			}
			System.out.println();
		}
		numberhorse(hs, 3, 3);

	}

	public static void numberhorse(int[][] a, int row, int cl) {
		int max, min;
		int index;
		int[] b = new int[100];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cl; j++) {
				if (a[i][j] == checkmin(a, i, cl)) {
					index = j;
					max = a[i][index];
					for (int mr = 0; mr < row; mr++) {
						if (max < a[mr][index]) {
							max = a[mr][index];
						}
					}
					if (max == checkmin(a, i, cl)) {
						System.out.println("Horse saddle point:" + a[i][index] + " " + "row:" + (i + 1) + " column:"
								+ (index + 1));
					}
				}
			}

		}
//		for(int bc=0;bc<cl;bc++) {
//			System.out.print(b[bc]+" ");
//		}
	}

	public static int checkmin(int[][] a, int row, int cl) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < cl; i++) {
			if (a[row][i] <= min) {
				min = a[row][i];
			}
		}
		return min;
	}

}
