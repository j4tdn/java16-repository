package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWihoutBreak {
	public static void main(String[] args) {
		int mounth = 1 + new Random().nextInt(12);
		System.out.println("tháng "+mounth+ " có ");
		switch (mounth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 ngày");
			break;
		case 6:
		case 4:
		case 11:
			System.out.println("30 ngày");
		default:
			break;
		}
	}
}
