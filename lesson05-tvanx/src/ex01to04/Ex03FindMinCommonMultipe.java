package ex01to04;

import java.util.Scanner;

public class Ex03FindMinCommonMultipe {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.print("Enter n:");
		do {
			n = ip.nextInt();
			if(n < 2 || n >= 20) {
				System.out.print("error!! Enter 2<n<20: ");
			}
		} while (n < 2 || n >= 20);
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ":");
			do {
				A[i] = ip.nextInt();
				if(A[i] > 10 || A[i] < 1) {
					System.out.println("error!! Enter element in [1,10]");
				}
			} while (A[i] > 10 || A[i] < 1);
		}
		findMinCMList(A);
	}
	
	private static void findMinCMList(int[] a) {
		int mincm=a[0];
		for(int i=1;i<a.length;i++) {
			mincm=findMinCM(mincm, a[i]);
		}
		System.out.println("Min Common Multipe : "+mincm);
	}
	
	private static int findMinCM(int a, int b) {
		int mincm=0;
		for (int i = Math.max(a, b); i <= a * b; i++) {
			if(i%a==0 && i%b==0) {
				mincm=i;
				break;
			}
		}
		return mincm;
	}
}
