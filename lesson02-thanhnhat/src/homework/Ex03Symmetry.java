package homework;

import java.util.Scanner;

public class Ex03Symmetry {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong can kiem tra: ");
		int a = ip.nextInt();
		if (reverseNum(a) == a)
			System.out.println("a là số đối xứng!!!");
		else
			System.out.println("a không phải là số đối xứng!!!");

	}

	private static int reverseNum(int a) {
		int reverse = 0;
		while (a > 0) {
			int number = 0;
			int replaceNumber = a;
			number = replaceNumber % 10;
			reverse = reverse * 10 + number;
			replaceNumber /= 10;
		}
		return reverse;
	}

	
	}




