package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.println("Enter your age:");
	int  age = Integer.parseInt(ip.nextLine());
	
	System.out.println("Enter your first name:");
	String firstname = ip.nextLine();
	
	System.out.println("Enter your last name:");
	String lastname = ip.nextLine();
	
	System.out.println("Enter your email:");
	String email = ip.nextLine();
	
	
	System.out.println("========");
	System.out.println("fullname:" +firstname +" "+lastname);
	System.out.println("age:"+age);
	System.out.println("email:"+email);
}
}
