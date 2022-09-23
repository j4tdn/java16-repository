package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b;
		
		do {
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.println("Nhap b: ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("So khong hop le vui long nhap lai!!!");
			}
		}while (true);
		int x = -b/a;
		System.out.println("Gia tri cua x la: " + x);
		ip.close();
	}
}
