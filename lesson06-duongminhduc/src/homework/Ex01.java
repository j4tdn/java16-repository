package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		do
		{
			try {
				do
				{
					System.out.println("Enter a: ");
					a = Integer.parseInt(sc.nextLine());
				}
			    while(a == 0);
				
				System.out.println("Enter b: ");
				b = Integer.parseInt(sc.nextLine());
				
				
				System.out.println("Phương trình : " + a + "x + " + "(" + b + ") = 0");
				break;
				
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		while(true);
		System.out.println("x = " + findX(a, b));
	}
	public static double findX(int a, int b)
	{
		return (double) -b / a;
	}
}
