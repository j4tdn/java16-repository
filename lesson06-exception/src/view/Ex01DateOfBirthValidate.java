package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter  birth yead : ");
		int byear = 0;
		do {
			try {
				byear = Integer.parseInt(ip.nextLine());
				break;

			} catch (Exception e) {
				System.out.println("Hay nhap so ");
			}

		} while (true);
		int age = Year.now().getValue() - byear;
		System.out.println("Age " + age);
		//khoi try co the dung cho nhieu` exception
		ip.close();
	}

}
