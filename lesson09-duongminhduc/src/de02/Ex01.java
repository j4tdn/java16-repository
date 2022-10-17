package de02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]= ");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			System.out.println("b[" + j + "]= ");
			b[j] = sc.nextInt();
		}
		System.out.println("Output: s");
		commonNumber(a, b);

	}

	public static void commonNumber(int a[], int b[]) {
		int c[]= new int[a.length];
		int d = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j])
				{
					d = a[i];
					if(check(c, d) == true)
					{
						c[k++] = a[i];
					}
					
				}
			}
		}
	   for(int i = 0;i<k;i++)
	   {
		   System.out.print(c[i] + " ");
	   }
	}
	public static boolean check(int c[], int b)
	{
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] == b)
			{
				return false;
			}
		}
		return true;
	}
}
