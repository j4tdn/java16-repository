package io;

import java.util.Scanner;


public class Ex01BasicScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firsName = sc.nextLine();
		
		System.out.print("Enter your first name: ");
		String lastName = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your emai: ");
		String emai = sc.nextLine();
		System.out.println("==========================");
		System.out.println("fullname: " + (firsName + lastName));
		System.out.println("age: " + age);
		System.out.println("email: " + emai);
		

	}

}
