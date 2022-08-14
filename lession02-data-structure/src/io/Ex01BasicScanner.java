package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] arges) {
		Scanner ip =new Scanner(System.in);//nhập class đối tượng Scanner  // .in :nhập dữ liệu từ bàn phím
		System.out.println("Enter your first name" );
		String firstName = ip.nextLine();// dùng biến kiểu Scanner .nextline
		
		System.out.println("Enter your last name" );
		String lastname = ip.nextLine();//(dùng biến kiểu Scanner rồi .nextline là cho nhập vào chuỗi)
		
        System.out.println("Enter your age: ");
        int age = ip.nextInt();
        
		System.out.println("Enter your Email" );
		String email = ip.nextLine();
		
		System.out.println("Enter your salary" );
		String salary = ip.nextLine();
		
		System.out.println("======================");
		
		System.out.println("fullname " +(firstName + lastname) );
		System.out.println("age " + age);
		System.out.println("Email " + email );
		System.out.println("salary " + salary);
		
	}

}
