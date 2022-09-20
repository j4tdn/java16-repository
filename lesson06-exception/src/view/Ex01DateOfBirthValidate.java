package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		// NumberFormatException
		// xử lí ngoại lệ 
		// cách 1: tiền xử lí - đảm bảo dữ liệu chính xác để không
		// bao giờ xảy ra ngoại lệ khi thực thi
		
		String yobAsText = " ";
		do { 
			// block scope
			System.out.println("Enter year of birth: ");
			yobAsText = ip.nextLine();
			if (yobAsText.matches("\\d+")) {
				break;
			}
		} while (true);
				
		int yob = Integer.parseInt(yobAsText);
		
		int curYear = Year.now().getValue();
		System.out.println("he is: " + (curYear - yob + 1) + " year old");
		
		ip.close();
 	}
}
