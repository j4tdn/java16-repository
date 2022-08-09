package condition.loop;

import java.util.Scanner;

import bean.number;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st --> using for
		for (int i = 0; i < 10; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=============");

		// 2nd --> Using while
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
			i += 2;
		}
		// 3rd -->using do while
		Scanner ip = new Scanner(System.in);
		String numberText = "";
		do {
			System.out.print("Enter number:");
			numberText = ip.nextLine();
		} while (!numberText.matches("\\d+"));
		int number = Integer.parseInt(numberText);
		System.out.println("number :" + number);
		System.out.println("finish");
	}

}
