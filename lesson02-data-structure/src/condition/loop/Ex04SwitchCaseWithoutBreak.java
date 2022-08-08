package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		Random rd = new Random();
		int month = rd.nextInt(12) + 1;
		System.out.println("Month : " + month);
		switch (month) {
		case 1:System.out.println("31 ngày");
		case 2:System.out.println("28 ngày");
		case 3:System.out.println("31 ngày");
		case 4:System.out.println("30 ngày");
		case 5:System.out.println("31 ngày");
		case 6:System.out.println("30 ngày");
		case 7:System.out.println("31 ngày");
		case 8:System.out.println("31 ngày");
		case 9:System.out.println("30 ngày");
		case 10:System.out.println("31 ngày");
		case 11:System.out.println("30 ngày");
		case 12:System.out.println("31 ngày");
		default:
			System.out.println("tháng không hợp lệ");
		}
	}
}
