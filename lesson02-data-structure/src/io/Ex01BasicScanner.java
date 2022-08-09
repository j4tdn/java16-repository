package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your firstname: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter your lastname: ");
		String lastName = ip.nextLine();
		
		System.out.println("Enter your age :");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter your email:");
		String email = ip.nextLine();
		
		System.out.println("==================");
		
		System.out.println("Full name " + firstName + " " + lastName);
		System.out.println("age :" + age);
		System.out.println("Email :" + email);
		
	}

}
