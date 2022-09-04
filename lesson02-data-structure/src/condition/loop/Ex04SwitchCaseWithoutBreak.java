package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.println("month: " + month);
		switch (month) {
		case 1,3,5,7,8,10,12:
			System.out.println("Tháng có 31 ngày");
		    break;
		case 4,6,9,11:
			System.out.println("Tháng có 30 ngày");
			break;
		case 2:
			System.out.println("Tháng có 28 ngày");
		}
	}
}
