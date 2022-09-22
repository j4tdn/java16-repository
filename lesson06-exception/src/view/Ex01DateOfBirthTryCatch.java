package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// xử lý ngoại lệ
		// cách 1: tiền xử lý-đảm bảm dữ liệu chính xác để không bao h xảy ra ngoại lệ
		// khi thực thi
		// Cách 2: sử sụng khối tru/catch để bắt ngoại lệ--> chương trình tiếp tục thực
		// thi khi ngoại lệ xảy ra
		//nên dùng chính xác exception xảy ra trong catch
		//khi khối try bị nhiều exception--> sử dụng exception cha để cover
		int yob = 0;
		do {
			try {
				System.out.println("enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!");
				e.printStackTrace();
			}
		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("he is " + (curYear - yob + 1) + "year old");

		ip.close();
	}

}
