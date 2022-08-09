package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		// Random diem ngau nhien tu [1 den 10]

		// Neu diem < 5 ==> Hoc luc yeu

		// Neu diem <=5 va <8 ==> Hoc luc trung binh

		// Neu diem >=8 ==> Hoc luc gioi

		Random rd = new Random();

		int point = 1 + rd.nextInt(10 - 1 + 1);
		System.out.println("point: " + point);

		if (point >= 0 && point < 5) {
			System.out.println("Yeu");
		} else if (point < 8) {
			System.out.println("TB");
		} else if (point <= 10) {
			System.out.println("Gioi");
		} else {
			System.out.println("Diem khong hop le");
		}
	}
}
