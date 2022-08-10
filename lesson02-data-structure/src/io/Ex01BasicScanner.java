package io;

import java.util.Scanner;

public class Ex01BasicScanner {

	public static void main(String[] args) {
		Scanner ip = new Scanner ( System.in);
		System.out.print( " Enter your fistname");
		String fistname = ip.nextLine();
		
		System.out.print( " Enter your lastname");
		String lastname = ip.nextLine();
		
		System.out.print( " Enter your age ");
		int age =  Integer.parseInt(ip.nextLine());
		System.out.print( " Enter your gmail ");
		 String gmail = ip.nextLine();
		
		System.out.println(" fullname  : " + fistname + lastname);
		System.out.println(" Age : " + age);
		System.out.println( " gmail: "+ gmail);
	}

}
