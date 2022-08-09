package condision.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st --> using for

		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0) {
				System.out.println(i + "");

			}
			System.out.println("===============");
			// 2nd --> using while
			int i1 = 0;

			while (i1 < 10) {
				if (i1 % 4 == 0) {
					System.out.println(i1 + "");
				}
				i1 += 2;

			}
			// 3nd --> Viết chương trình nhập vào 1 số nguyên hợp lệ
			// Nếu nhập sai quá 3 lần thì thoát chương trình
			// TODO: nếu nhập sai quá 3 lần thì thoát chương trình
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter valid number:");
			// kiểm tra numberAsText là số thì mới parse sang int
			// \\d: số nguyên
			// + : 1 hoặc nhiều
			String numberAsText;
			do {
				System.out.println("Enter valid number:");

				numberAsText = ip.nextLine();
			} while (!numberAsText.matches("\\d+"));

			int number = Integer.parseInt(numberAsText);
			System.out.println("number:" + number);
		
		System.out.println("Finish");
	}
	}
}

