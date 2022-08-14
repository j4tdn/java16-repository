package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] arges) {
		int month = 1 + new Random().nextInt(12);
		System.out.println("Thang" + month);
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31 ngay ");
		case 4, 6, 9, 11:
			System.out.println("30 ngay");
		default:
		System.out.println("khong hop le ");
		}
	}

}
