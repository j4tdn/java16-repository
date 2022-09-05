package ex02;

import java.util.Scanner;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Input n: ");
		int n = ip.nextInt();

		int[] number = new int[n];

		for (int i = 0; i < number.length - 1; i++) {
			do {
				System.out.println("Input number[" + i + "]: ");
				number[i] = ip.nextInt();
				if (number[i] < 1 || number[i] > n) {
					System.out.print("error!! Enter Ak = [1, n]");
				}
			} while (number[i] < 1 || number[i] > n);
		}
		for(int i = 0 ; i < number.length - 1; i++) {
			System.out.print(number[i] + " ");
		}
		
		System.out.println("\nMissing Number in array :" + getMissingNumber(number));
	}
	
	static int maxInArray(int a[] )
	{
	    int max=0;
	    for(int i=0;i<a.length - 1;i++)
	    {
	        if(a[i]>max)
	          max=a[i];
	    }
	    return max;
	}

	static int getMissingNumber(int a[])
	{
	    int max=maxInArray(a);
	    boolean check=true;
	    for(int i=1;i<=max;i++)
	    {
	        for(int j=0;j<a.length - 1;j++)
	        {
	            if(a[j]!=i)
	            {
	                check=false;
	            }
	            else
	               {check=true;
	                   break;
	               }
	        }
	        if(check==false)
	          return i;
	    }
	    return 0;
	}

}
