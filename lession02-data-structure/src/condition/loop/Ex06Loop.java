package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] arges) {
		// 1st--> using for
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("==============================");
		// dùng while
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.println(i + " ");
			}
			i += 2;
		}
		System.out.println("==============================");

		// 3nd--> viết chương trình nhập vào số nguyên hợp lên
		// nếu nhập sai 3quas 3 lần thì thoát chương trình

		Scanner ip = new Scanner(System.in);
		String numberAsTest = "";

		// kiểm tra numberAsTest là số thì mới past sang int
		// \\d: là số nguyên

		// + : 1 hoặc nhiều
		do {
			System.out.println("Enter valid number ");
			numberAsTest = ip.nextLine();
		} while (!numberAsTest.matches("\\d+"));
		int number = Integer.parseInt(numberAsTest);
		System.out.println("number " + number);

		System.out.println("finish ");
	}
}
