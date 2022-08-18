package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st --> using for
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0)
				System.out.println(i);
		}

		// 2nd -->while
		int i = 0;
		while (i > 10) {
			if (i % 4 == 0)
				System.out.println(i);
		}
		i += 2;

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";

		do {
			System.out.println("Enter valid number:");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		int number = Integer.parseInt(numberAsText);
		System.out.println("number:" + number);
		System.out.println("Finish");

	}
}
