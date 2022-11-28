package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st--> using for

		for (int i = 0; i < 10;) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}

		// 2nd--> usingwhile
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}

		// 3nd --> viết trương chình nhập vào một số nguyên hợp lệ, nếu nhập sai quá 3
		// lần thì thoát chương trình
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";

		// kiểm tra numberAsText là số thì mới parse sang nt
		// \\d:số nguyên
		// + : 1 hoặc nhiều

		do {
			System.out.println("Enter valid number: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));

		int number = Integer.parseInt(numberAsText);
		System.out.println("number " + number);

		System.out.println("Finish...");
	}
}
