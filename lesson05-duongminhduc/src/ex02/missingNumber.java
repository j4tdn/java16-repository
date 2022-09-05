package ex02;

import java.util.Scanner;

public class missingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter array a: ");
		for(int i = 1;i<n;i++)
		{
			
			a[i] = sc.nextInt();
		}
		
		System.out.println("Number :" + getMissingNumber(a, n));
	}
	public static int getMissingNumber(int a[], int n)
	{
		int tong1 = 0;
		int tong2 = 0;
		for(int i = 1;i<=n;i++)
		{
			tong1 += i;
		}
		for(int i = 0;i< a.length;i++)
		{
			tong2 += a[i];
		}
		return tong1-tong2;
		
	}
	
}
