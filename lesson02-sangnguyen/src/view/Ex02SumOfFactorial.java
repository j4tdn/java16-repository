package view;

import java.util.Scanner;

public class Ex02SumOfFactorial {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the number of elements: ");
       int n;
       n = sc.nextInt();
       
       int[] array = new int[n];
       for(int i = 0; i<n; i++)
       {
    	   System.out.println("array["+i+"] = ");
    	   array[i] = sc.nextInt();
       }
       System.out.println("Sum of factorial: " + sum(array));
       
	}
	private static int sum(int[] a)
	{
		int sum = 0;
		for(int i = 0;i < a.length;i++)
		{
			sum += factorial(a[i]);
		}
		return sum;
	}
	private static int factorial(int n)
	{
		if(n > 0)
		{
			return n * factorial(n - 1);
		}
		else
		{
			return 1;
		}
		
	}
}
