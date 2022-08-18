package view;


import java.util.Scanner;

public class Ex04LargestOddNumber {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the number of elements: ");
     int n;
     n = sc.nextInt();
     int[] a = new int [n];
     for(int i = 0; i< n;i++)
     {
    	 System.out.println("a[" + i + "] = ");
    	 a[i] = sc.nextInt();
     }
     System.out.println("Largest odd number: " + checklargestoddnumber(a));
	}
	private static int checklargestoddnumber(int[] a)
	{
		int[] b = new int[a.length];
		for(int i = 0 ;i < a.length ;i++)
		{
			if(a[i] %2 != 0)
			{
				b[i] = a[i];
			}
		}
		int max = b[0];
		for(int n = 0 ; n < b.length ; n++)
		{
			if(b[n] >= max)
			{
				max = b[n];
			}
		}
		return max;
	}
}

