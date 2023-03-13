package view;

import java.util.Scanner;

public class Ex01PowerOfTwo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter valid number: ");
		int number = ip.nextInt();
		
		isPowerOfTwo(number);
		
	}
	
	private static int isPowerOfTwo(int number) {
		int a = number / 2;
		int b = a % 2;
		
		if (a == 0 && b == 0) {
			 System.out.println(number + " is power of 2");
		} else {
			System.out.println(number + " isn't power of 2");
		}
		
		return number;
	}
}
