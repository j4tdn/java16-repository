package io;

import java.util.Scanner;

public class Ex01BasicScanner {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter your first name:");
	
	String firsName = ip.nextLine();
	System.out.println("Enter your salary");
	double salary = Double.parseDouble(ip.nextLine());
	
	int age = Integer.parseInt(ip.nextLine());
	System.out.println("Enter your last name:");
	
	String lastName = ip.nextLine();
	System.out.println("Enter your email:");
	String email = ip.nextLine();
	System.out.println("=====================");
	
	System.out.println("fullName:"+ (firsName+lastName));
	System.out.println("age: "+ age);
	System.out.println("age: "+ salary);
	System.out.println("age: "+ email);
	
}
}
