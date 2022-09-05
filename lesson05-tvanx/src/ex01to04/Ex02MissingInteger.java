package ex01to04;

import java.util.Scanner;

public class Ex02MissingInteger {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n:");
		int n=ip.nextInt();
		int[] arr = new int[n-1];
		
		for(int i=0;i<n-1;i++) {
			System.out.print("Enter element");
			do {
				arr[i]=ip.nextInt();
				if(arr[i]<1||arr[i]>n) {
					System.out.println("error!! Enter element in [1,n]");
				}
			}while(arr[i]<1||arr[i]>n);
		}
		
		System.out.println(findMissingIteger(arr));
	}
	private static int findMissingIteger(int[] a) {
		int count;
		for(int i=1;i<=a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				return i;
			}
		}
		return 0;
	}
}
