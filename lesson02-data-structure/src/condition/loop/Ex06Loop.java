package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st -->using for
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0) {
				System.out.println(i + " ");
			}
		}

		System.out.println("\n============== ");

		// 2nd --> while
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.println(i + " ");
			}
			i += 2;
		}

		// 3nd --> viet chuong trinh nhap vao 1 so nguyen hop le
		// TODO:neu nhap sai qua 3 lan thi thoat chuong trinh
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";

		// kiem tra numberAsTest la so thi moi parse sang int
		// \\d: so nguyen
		// + : 1 hoac nhieu
		do {
			System.out.println("Enter valid number: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));

		int number = Integer.parseInt(numberAsText);
		System.out.println("number: " + number);

		System.out.println("Finish");
	}

}
