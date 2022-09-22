package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// xử lý ngoại lệ
		// cách 1: tiền xử lý-đảm bảm dữ liệu chính xác để không bao h xảy ra ngoại lệ
		// khi thực thi
		String yobAsTest = "";
		do {
			System.out.println("enter your birth");
			yobAsTest = ip.nextLine();
			if (yobAsTest.matches("\\d+")) {
				break;
			}
		} while (true);
		int yob = Integer.parseInt(yobAsTest);

		int curYear = Year.now().getValue();
		System.out.println("he is " + (curYear - yob + 1) + "year old");

		ip.close();
	}

}
