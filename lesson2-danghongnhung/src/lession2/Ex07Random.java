package lession2;

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args)
	{
		 Random rd = new Random();
		 int arr[]=new int[5];
		 
		 
		 for(int i=0;i<5;i++)
		 {
			 int a= 0;
			 do
			 {
				 a=10 + rd.nextInt(20);
			 }
			 while(!check(arr,a));
		
			 arr[i]=a;
		 }
		 
		 for(int i=0;i<5;i++)
			 System.out.println(arr[i]+" ");
	}

	public static boolean check(int[] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
				return false;
		}
		return true;
	}
		
		
		
		
}
