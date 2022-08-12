package view;

import java.util.Scanner;

public class Ex01CheckPowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       float number;
       number = sc.nextFloat();
       if(Check(number))
       {
    	   System.out.println(number + " is power of two");
       }
       else
       {
    	   System.out.println(number + " not a power of two");
       }
	}
	private static boolean Check(float n)
	{
		if( 0 == n|| 1 == n ) return true;
		float x = n / 2;
		float y = n%2;
		if (1 == y) return false;
		return Check(x);
	}
}
