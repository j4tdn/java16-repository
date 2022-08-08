package condition.loop;

import java.util.Scanner;

public class Ex06Loop {

	public static void main(String[] args) {
		// 1st --> using for --> duyet mang
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n===================");
		
		// 2nd --> using while --> tinh toan
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}
		
		System.out.println("\n===================");
		
		// 3nd --> Nhap vao so nguyen
		// Neu sai 3 lan thi thoat chuong trinh
		
		Scanner ip = new Scanner(System.in);
		String numberAsTest = "";
		
		do {
			System.out.println("Enter valid number");
			String numberAsText = ip.nextLine();
		} while (!numberAsTest.matches("\\d+"));
		
		int number = Integer.parseInt(numberAsTest);
		System.out.println("");

	}
	
}
