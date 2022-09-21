package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// NumberFormatException
		// Xử lý ngoại lệ
		// Cách 1: Tiền xử lý - Đảm bảo dữ liệu chính xác để ko bao giờ xảy ra ngoại lệ khi thực thi
		String yobAsText = "";
		do {
			System.out.println("Enter year of birth: ");
			yobAsText = ip.nextLine();
			if (yobAsText.matches("\\d+")) {
				break;
			}
		} while (true);

		int yob = Integer.parseInt(yobAsText);

		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");
		
		ip.close();
	}

}
