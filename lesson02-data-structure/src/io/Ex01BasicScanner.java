package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your firstname: ");
		String firstName = ip.nextLine();
		System.out.println("Enter your lastname: ");
		String lastName = ip.nextLine();
		System.out.println("Enter your age: ");
		// Nen dung cai nay vi se khong bi loi phan /enter
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("Enter your salary: ");
		double salary = Double.parseDouble(ip.nextLine());
		System.out.println("Enter your email: ");
		String email = ip.nextLine();
		System.out.println("Fullname: " + (firstName + lastName));
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Email: " + email);
		ip.close();
	}
}
