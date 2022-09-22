package view;

import java.time.Year;
import java.util.Scanner;

public class ExDateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Validation
		// xử lý ngoại lệ
		// Cách 1 : Tiền xử lý - Đảm bảo dữ liệu chính xác để khbh xay ra ngoại lệ khi
		// thực thi.
		// cách 2 : Sử dụng khối try catch để bắt ngoại lệ --> Để chương trình tiếp tục
		// thực thi
		// khi ngoại tệ xảy ra.
		// khi khối tty catch bị nhiều exception -->sử dụng excreption cha để cover
		int yob = 0;
		do {
			try {
				System.out.println("Year of birth:");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!");
				e.printStackTrace();
			}
		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("He is" + (curYear - yob + 1) + "year old");
		ip.close();
	}
}
