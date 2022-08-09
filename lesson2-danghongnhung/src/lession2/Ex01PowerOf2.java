package lession2;

import java.util.Scanner;

public class Ex01PowerOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		if(check(n))
			System.out.println(n + " là lũy thừa của 2");
		else 
			System.out.println(n + " không phải là lũy thừa của 2");
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
