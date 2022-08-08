package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		// Random diem ngau nhien tu [1 den 10]
		Random rd = new Random();
		int point = 1 + rd.nextInt(10);
		if (point >= 0 && point < 5) {
			System.out.println("hoc luc yeu");
		} else if (point >= 5 && point < 8) {
			System.out.println("Hoc luc trung binh");
		} else if (point <= 10) {
			System.out.println("Hoc luc gioi");
		} else {
			System.out.println("Diem khong hop le");
		}
		System.out.println("Finish ...");
		// Neu diem < 5 ==> hoc luc yeu

		// neu >=5 va <8 ==> hoc luc tb

		// neu >8 ==> hoc luc gioi
	}

}
