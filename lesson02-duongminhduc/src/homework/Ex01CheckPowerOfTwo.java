package homework;

import java.util.Scanner;

public class Ex01CheckPowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       float number;
       number = sc.nextFloat();
       if(Check(number))
       {
    	   System.out.println(number + " is a power of two");
       }
       else
       {
    	   System.out.println(number + " is not a power of two");
       }
	}
	private static boolean Check(float n)
	{
//		if( 1 == n ) return true;
//		float x = n / 2;
//		float y = n%2;
//		if (1 == y) return false;
//		return Check(x);
		if(n <= 0)
		{
			return false;
		}
		while(n != 1)
		{
			if(n % 2 != 0)
			{
				return false;
			}
			n /= 2;
			
		}
		return true;	}
}
