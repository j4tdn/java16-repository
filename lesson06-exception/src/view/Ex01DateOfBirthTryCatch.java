package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		// NumberFormatException
		// xử lí ngoại lệ
		// cách 1: tiền xử lí - đảm bảo dữ liệu chính xác để không bao giờ xảy ra ngoại
		// lệ khi thực thi

		// cách 2: sử dụng khối try/catch để bắt ngoại lệ --> chương trình tiếp tục thực
		// thi khi ngoại lệ xảy ra
		// Lưu ý: nên dùng chính xác exception xảy ra trong catch
		// khi khối try bị nhiều exception --> sử dụng exception cha để cover 
		int yob = 0;
		do {
			try {
				System.out.println("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!!!");
				e.printStackTrace();
			}
		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("he is: " + (curYear - yob + 1) + " year old");

		ip.close();
	}
}
