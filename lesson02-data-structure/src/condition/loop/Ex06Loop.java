package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st --> using for
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		System.out.println("=====================");
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}
		System.out.println("=====================");
		// 3nd --> Viet chuong trinh nhap vao 1 so nguyen hop le
		// Neu nhap sai qua 3 lan thi thoat chuong trinh
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		// Kiem tra numberAsText la so thi moi parse sang Int
		// \\d: so nguyen
		// + : 1 hoac nhieu
		do {

			System.out.println("Enter valid number: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));

		int number = Integer.parseInt(numberAsText);
		System.out.println("number: " + number);
	}
}
