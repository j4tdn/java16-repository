package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		//NumberFormatException
		//Xử lý ngoại lệ
		//Cách 1 : Tiền xử lý- đảm ảo dữ liệu chính xác để không bao giờ xảy ra ngoại lệ khi thực thi
		
		//Cách 2 : Sử dụng khối Try/Catch để bắt ngoại lệ --> Chương trình tiếp tục thực thi khi ngoại lệ xảy ra
		//Lưu ý: Nên dùng chính xác excepion xảy ra trong catch
		// Khi khối try bị nhiều exception ==> sử dụng exception cha để cover
		int  yob = 0;
		do {
			try {
				System.out.println("Enter year of birth: ");
				yob = Integer.parseInt(ip.next());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid Input: ");
				e.printStackTrace();
			}
		}while(true);
		
		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " year old");
		
		ip.close();
	}
} 	
