package io;

import java.util.Scanner;

public class Ex01BasicScanner {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your first name : ");
		String firstname = ip.nextLine();
		
		System.out.print("Enter your last name : ");
		String lastname = ip.nextLine();
		
		System.out.print("Enter your age : ");
		int age = Integer.parseInt(ip.nextLine());
		ip.nextLine();
		System.out.print("Enter your email : ");
		String mail = ip.nextLine();
		
		String fullname = firstname + lastname;
		System.out.println("=======================");
		System.out.println("full name : "+fullname);
		System.out.println("age : "+age);
		System.out.println("email : "+mail);
	}

}
