package horsesaddle;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số hàng M: ");
		int m;
		m = sc.nextInt();
		System.out.println("Nhập vào số cột N: ");
		int n;
		n = sc.nextInt();

		int arr[][] = new int[m][n];

		Random rd = new Random();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = rd.nextInt(1, 99);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println("\n");
		}
		horsesaddle(arr, m, n);

		
	}
	public static void horsesaddle(int a[][], int sh, int sc)
	{
		   int minhang[] = new int[10];
	        int maxcot[] = new int[10];
	        for (int i=0; i<sh; i++) {
	            minhang[i] = a[i][0];
	            for(int j=0; j<sc; j++) {
	                if (minhang[i] > a[i][j]) {
	                    minhang[i] = a[i][j];
	                }
	            }
	        }

	        for (int j=0; j<sc; j++) {
	            maxcot[j] = a[0][j];
	            for(int i=0; i<sh; i++) {
	                if (maxcot[j] < a[i][j]) {
	                    maxcot[j] = a[i][j];
	                }
	            }
	        }

	        for (int i=0; i<sh; i++) {
	            for (int j=0; j<sc; j++) {
	                if((a[i][j] == minhang[i]) && (a[i][j] == maxcot[j])) {
	                    System.out.println("yên ngựa  " +a[i][j]);
	                }               
	            }
	        }
	}
	
}
