package bai1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		try {
		findX();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
	public static void findX() {
		int a,b;
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.println("Enter b: ");
				b = Integer.parseInt(ip.nextLine());
				
				if (a == 0) {
					throw new IllegalArgumentException("please enter a != 0");
				}
				break;
				
			} catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
		System.out.println((float)-b/a);
	}
}
