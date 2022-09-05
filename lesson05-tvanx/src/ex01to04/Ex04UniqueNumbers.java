package ex01to04;

import java.util.Scanner;

public class Ex04UniqueNumbers {
	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		
		getUniqueNumbers(arr);
	}
	
	private static int maxInArray(int a[] )
	{
	    int max=0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]>max)
	          max=a[i];
	    }
	    return max;
	}

	private static void getUniqueNumbers(int a[])
	{
	    int length=maxInArray(a);
	    
	    int array[]=new int[length+1];
	    
	    for(int i=0;i<array.length;i++)
	      array[i]=0;
	      
	    for(int i=0;i<a.length;i++)
	      array[a[i]]++;
	      
	      for(int i=0;i<array.length;i++)
	      {
	          if(array[i]==1)
	            System.out.print(i+" ");
	            
	      }
	}
}
