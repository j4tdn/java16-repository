package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		// Random diem ngau nhien tu [1 - 10]
		Random rd = new Random();
		int point = rd.nextInt(10);
		System.out.println("Point: " + point);
		// Neu diem < 5 ==> Hoc luc yeu
		// Neu diem >= 5 va < 8 ==> Hoc luc trung binh
		// Neu diem >= 8 ==> Hoc luc gioi
		if (point < 5)
			System.out.println("Hoc luc yeu");
		else if (point < 8)
			System.out.println("Hoc luc trung binh");
		else if (point <= 10)
			System.out.println("Hoc luc gioi");
		else
			System.out.println("Diem khong hop le");
	}
}
