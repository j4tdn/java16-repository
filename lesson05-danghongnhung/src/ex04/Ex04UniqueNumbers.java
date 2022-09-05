package ex04;

import java.util.Scanner;

public class Ex04UniqueNumbers {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.println("Input n: ");
			n = ip.nextInt();
			if (n <= 2 || n >= 20) {
				System.out.print("error!! Enter 2<n<20: ");
			}
		} while (n <= 2 || n >= 20);

		int[] number = new int[n];
		
		for (int i = 0; i < number.length; i++) {
			do {
				System.out.println("Input number[" + i + "]: ");
				number[i] = ip.nextInt();
				if (number[i] < 0 || number[i] > 100) {
					System.out.print("error!! Enter Ak = [1, 10]: ");
				}
			} while (number[i] < 0 || number[i] > 100);
			
		}
		System.out.print("Input: ") ;
		for(int num : number) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nOutput: ");
		getUniqueNumbers(number);
		
	}
	static int maxInArray(int a[] )
	{
	    int max=0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]>max)
	          max=a[i];
	    }
	    return max;
	}

	static void getUniqueNumbers(int a[])
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
