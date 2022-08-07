package io;

import java.util.Scanner;

public class Ex01BasicScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//String email = ip.next();
		
		System.out.println("-------------------------");
		System.out.println("Full Name: "+ firstName +" " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Email: " + email);
	}

}
