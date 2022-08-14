package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter your salary: ");
		double salary = Double.parseDouble(ip.nextLine());
		
		System.out.print("Enter your email: ");
		String email = ip.nextLine();
		
		System.out.println("================");
		System.out.println("fullname: " + (firstName + lastName));
		System.out.println("age :" + age);
		System.out.println("salary :" + salary);
		System.out.println("email: " + email);
	}

}
