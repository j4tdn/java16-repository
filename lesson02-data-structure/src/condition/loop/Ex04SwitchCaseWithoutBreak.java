package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.println("Th�ng " + month + " c� ");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 ng�y");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 ng�y");
			break;
		case 2:
			System.out.println("28 ng�y");
		}
	}
}
