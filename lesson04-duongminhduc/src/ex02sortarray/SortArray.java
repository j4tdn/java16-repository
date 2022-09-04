package ex02sortarray;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n;
        n = sc.nextInt();
        int[] array = new int[n];  
      
        int[] a = new int[n];
        int j = 0;
        Random rd  = new Random();
        for(int i = 0;i<n;i++)
        {
        	array[i] = rd.nextInt(100);
        }
        for(int i = 0;i<n;i++)
        {
        	System.out.print(array[i] + " ");
        }
        for(int i = 0;i<n;i++)
        {
        	if(array[i] % 7 == 0 && array[i] % 5 != 0)
        	{
        		a[j++] = array[i];
        	}
        }
        for(int i = 0;i<n;i++)
        {
        	if((array[i] % 7 == 0 && array[i] % 5 == 0) || (array[i] % 7 != 0 && array[i] % 5 != 0) )
        	{
        		a[j++] = array[i];
        	}
        }
        for(int i = 0;i<n;i++)
        {
        	if(array[i] % 7 != 0 && array[i] % 5 == 0)
        	{
        		a[j++] = array[i];
        	}
        }
        System.out.println("\n==========================");
        for(j = 0;j<a.length;j++)
        {
        	System.out.print(a[j] + " ");
        }
	}
}
