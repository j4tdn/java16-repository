package lesson02;


import java.util.Scanner;

public class Ex01isPowerOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("n= ");
		int n = ip.nextInt();
		
		if(check(n))
			System.out.println(n + " is power of 2");
		else 
			System.out.println(n + " is not power of 2");
			System.out.println("Finish...");
			
	}
	private static boolean check(int n) 
	{
			double x=n;
			while(x>0)
			{
				x=x/2;
				if(x==1)
					return true;
			}
			return false;
	}
}