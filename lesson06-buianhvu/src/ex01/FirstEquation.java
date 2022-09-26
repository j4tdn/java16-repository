package ex01;

import java.util.Scanner;

public class FirstEquation {
	public static void main(String[] args) {

		float a; 
		float b;
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter a= ");
				a = Float.parseFloat(ip.nextLine());
				System.out.println("Enter b= ");
				b = Float.parseFloat(ip.nextLine());

				if (a == 0) {
					throw new IllegalArgumentException("a = 0 is invalid !!!");
				}
				break;

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
		System.out.println("x= "+(-b / a));
	}
	
}







