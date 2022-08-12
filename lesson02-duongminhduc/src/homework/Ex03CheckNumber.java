package homework;

import java.util.Scanner;

public class Ex03CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n;
		n = sc.nextInt();
		if(checknumber(n) == n)
		{
			System.out.println(n + " is a symmetric number");
		}
		else
		{
			System.out.println(n + " not a symmetric number");
		}
	}
	private static int checknumber(int number)
	{
		int m  = 0;
		while(number > 0)
		{
			m = m*10 + number % 10;
			number /= 10;
		}
		return m;
	}
}
