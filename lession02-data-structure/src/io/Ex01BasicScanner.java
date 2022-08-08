package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	 public static void main(String[] args) {
		 
		 Scanner ip =new Scanner(System.in);
		 
		 System.out.println("Enter your first name: ");
		 String firstName = ip.nextLine();
		 
		 System.out.println("Enter your last name: ");
		 String lastName = ip.nextLine();
		 
		 System.out.println("Enter your age; ");
		 int age = Integer.parseInt(ip.nextLine());
		 
		 System.out.println("Enter your salary: ");
		 Double salary = Double.parseDouble(ip.nextLine());
		 
		 System.out.println("Enter your email: ");
		 String email = ip.nextLine();
		 
		 System.out.println("====================");
		 
		 System.out.println("Full name: " + (firstName + lastName));
		 System.out.println("Age: " + age);
		 System.out.println("Email: " + email);
		 System.out.println("Salary: " + salary);
		 
	}
}
