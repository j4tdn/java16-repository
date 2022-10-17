package de02;


import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		if(checkNumber(n))
		{
			System.out.println(n + " is number happy ");
		}

	}
	
	public static boolean checkNumber(int n)
	{
		int r,sum;
		while(n != 1)
		{
		    sum = 0;
			while(n > 0)
			{
				 r = n%10;
				 sum += r*r;
				 n /= 10;
				
			}
			n = sum;
		}
		return true;
	}
}
