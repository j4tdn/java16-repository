package view;

import java.time.Year;
import java.util.Scanner;

/*
 * 1. Enter a year of birth - calculate age of candidate
 * 
 */
public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		// NumberFormatException
		// Xử lý ngoại lệ
		// Cách 2: Xử dụng khối try/catch để bắt ngoại lệ -> Chương trình tiếp tục
		// thực thi khi ngoại lệ xảy ra
		// Nên dùng chính xác exeption xảy ra trong catch, khi 
		// trong khối Try có nhiều Exception -> Sử dụng exception cha để cover
		int yob = 0;
		do {
			try {
				System.out.println("Enter year of birth");
				 yob = Integer.parseInt(ip.nextLine());
				 break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input !!!");
				// in ra lỗi của java
				e.printStackTrace();
			}
		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");
	
	ip.close();
	}
}
