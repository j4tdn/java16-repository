package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		// Ramdom diem tu 1 - 10
		// Neu diem < 5 Yeu
		// >= 5 va < 8 Kha
		// >=8 Gioi
		Random rd = new Random();
		int point = 1 + rd.nextInt(10 - 1 + 1);
		System.out.println(point);

		if (point < 5) {
			System.out.println("Yeu");
		} else if (point >= 5 && point < 8) {
			System.out.println("Kha");
		} else if (point <=10 ){
			System.out.println("Gioi");
		} else {
			System.out.println("Diem khong hop le");
		}
	}
}
