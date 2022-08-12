package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.println("Th�ng " + month + " c� ");
		
		switch (month) {
		case 1, 3, 5, 7, 8, 12:
			System.out.println("31 ng�y");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 ng�y");
		default:
			break;
		}
	}
}
