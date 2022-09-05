package Bai3;

import java.util.Scanner;

public class B3 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số phần tử:");
		int n = ip.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i] = ip.nextInt();
		}
		
		System.out.println("Bội chung nhỏ nhất của các phần tử trong mảng là: " + getLeastCommonMultiple(a, n));
	}
	
	private static int getLeastCommonMultiple(int[] a, int n) {
		int min=(a[0]*a[1])/find(a[0], a[1]);
		for(int i = 2; i<n;i++) {
			min=(min*a[i])/find(min, a[i]);
		}
		return min;
	}
	
	private static int find(int a, int b) {
		if (b==0) return a;
		return  find(b, a%b);
	}
}
