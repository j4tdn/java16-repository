package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Nhap tuoi:");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("So gio:");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.println("So phut:");
		int minute = Integer.parseInt(sc.nextLine());
		System.out.println("Thoi gian bat dau ngu:");
		int sleepStartTime = Integer.parseInt(sc.nextLine());
		int sleepTime = hour * 60 + minute;
		if (age >= 1 && age <= 3)
			a = 1200 - sleepTime;
		else if (age <= 13)
			a = 660 - sleepTime;
		else if (age <= 17)
			a = 540 - sleepTime;
		else if (age <= 64)
			a = 480 - sleepTime;
		else
			a = 450 - sleepTime;
		if (a < 0)
			a = 0;
		b = a / 60;
		c = a % 60;
		System.out.print("Ban nen thuc day luc " + (sleepStartTime + b) % 24 + ":");
		if (c < 10)
			System.out.print("0");
		System.out.println(c);
	}
}
