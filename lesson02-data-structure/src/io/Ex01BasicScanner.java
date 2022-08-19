package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your firstName: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter your firstName: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter your age: ");
		//int age = ip.nextInt();
		int age = Integer.parseInt(ip.nextLine());
		//ip.nextLine();
		
		System.out.println("Enter your salary: ");
		double salary = Double.parseDouble(ip.nextLine());
		
		System.out.print("Enter your age: ");
		String email = ip.nextLine();
	
		System.out.println("=============");
		
		System.out.println("fullName: " + (firstName + lastName));
		System.out.println("age: "+ age);
		System.out.println("salary: "+ salary);
		System.out.println("email: "+ email);

	} 
}
