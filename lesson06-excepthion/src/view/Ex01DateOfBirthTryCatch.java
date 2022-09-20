package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		//NumerFormatException
		//Xử lý ngoại lệ
		//Cách 1 : Tiền xử lý- đảm ảo dữ liệu chính xác để không bao giờ xảy ra ngoại lệ khi thực thi
		String yearAsText = " ";
		do {
			//block scope
			System.out.println("Enter year of birth: ");
			yearAsText = ip.nextLine(); 
			if(yearAsText.matches("\\d+")) { //d = 0-9
				break;
			}
		}while(true);
		
		int  yearOfBirth = Integer.parseInt(yearAsText);
		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yearOfBirth + 1) + " year old");
		
		ip.close();
	}
} 	
