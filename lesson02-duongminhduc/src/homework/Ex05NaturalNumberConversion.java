package homework;

import java.util.Scanner;

public class Ex05NaturalNumberConversion {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n;
       n = sc.nextInt();
       System.out.println("Number: " + conversion(n));
       
	}
	private static int conversion(int n)
	{
		int sum = 0,i = 1,r;
		do
	    {
	        r=n%2;
	        sum=sum + (i*r);
	        n=n/2;
	        i=i*10;
	    }while(n>0);
	    return sum;
	}
}
