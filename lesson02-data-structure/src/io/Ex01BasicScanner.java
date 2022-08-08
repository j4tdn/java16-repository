package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap firstname :");
		String firstname = ip.nextLine();
		
		System.out.print("Nhap lastname :");
		String lastname = ip.nextLine();
		System.out.println("fullname: " + firstname + lastname);
		System.out.println("Nhap age :");
		int age = Integer.parseInt(ip.nextLine());
		System.out.print("Nhap email :");
		String email = ip.nextLine();
	}

}
