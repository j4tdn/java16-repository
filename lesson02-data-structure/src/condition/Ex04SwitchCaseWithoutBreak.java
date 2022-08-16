package condition;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month=1+new Random().nextInt(12);
		System.out.println("month: "+month);
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:		
			System.out.println("31 ngày");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30 ngày");
			break;
		case 2:
			System.out.println("28 ngày");
			break;
		default:
			System.out.println("Tháng không hợp lệ");
			break;
		}
		System.out.println("Finish...");
	}
}
