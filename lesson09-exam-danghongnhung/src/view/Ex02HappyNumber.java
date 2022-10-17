package view;

import java.util.Scanner;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number: ");
		int number = sc.nextInt();
		System.out.println(isHappyNumber(number));
	}
	
	static boolean isHappyNumber(int n)
	{
		while(n!=1 && n!=4)
		{
			n=happyNumber(n);
		}
		if(n==1)
		 return true;
		return false;
	}
	static int happyNumber(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=Math.pow((n%10), 2);
			n/=10;
		}
		return sum;
	}
}
