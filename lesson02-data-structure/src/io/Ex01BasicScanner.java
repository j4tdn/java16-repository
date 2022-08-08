package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your email: ");
		String email = sc.nextLine();
		
		System.out.println("Full name: "+firstName+" " +lastName);
		System.out.println("Age: "+age);
		System.out.println("Email: "+email);
		sc.close();
	}
}
