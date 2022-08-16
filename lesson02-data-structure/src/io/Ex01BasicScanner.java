package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstname = ip.nextLine();
		System.out.print("Enter your last name: ");
		String lastname = ip.nextLine();
		
		System.out.print("Enter your age: ");
		int age=Integer.parseInt(ip.nextLine());

		System.out.print("Enter your Salary: ");
		double salary=Double.parseDouble(ip.nextLine());

		System.out.print("Enter your email: ");
		String email=ip.nextLine();
		
		System.out.println("full name: " + firstname + " " + lastname);
		System.out.println("age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Email: "+email);
		ip.close();
	}
}