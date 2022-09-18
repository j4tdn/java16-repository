package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);	
		
		//NumberFormatException
		//xử lí ngoại lệ
		//Cách 1: tiền xử lí - Đảm bảo dữ liệu chính xác để không bao giờ xảy ra ngoại
		// lệ khi thực thi
		String temp = "";
		do {
			System.out.println("Enter year of birth: ");
			temp = ip.nextLine();
			if(temp.matches("\\d+")) {
				break;
			}
			// \\d = [0..9], \\d+ = nhiều số
		}
		 while (true);
		int yob = Integer.parseInt(temp);
		
		
		int curYear = Year.now().getValue();		
		System.out.println("He is " + (curYear - yob + 1) + " years old");
		
		ip.close();
	}

}
