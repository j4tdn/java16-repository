package condition.lopp;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.print("month " + month +" have ");
		switch (month) {
		case 1:
			System.out.println("31 day");
			break;
		case 2:
			System.out.println("28 day");
			break;
		case 3:
			System.out.println("31 day");
			break;
		case 4:
			System.out.println("30 day");
			break;
		case 5:
			System.out.println("31 day");
			break;
		case 6:
			System.out.println("30 day");
			break;
		case 7:
			System.out.println("31 day");
			break;
		case 8:
			System.out.println("31 day");
			break;
		case 9:
			System.out.println("30 day");
			break;
		case 10:
			System.out.println("31 day");
			break;
		case 11:
			System.out.println("30 day");
			break;
		case 12:
			System.out.println("31 day");
			break;
		default:
			System.out.println("Error Month !!!");
			break;
		}
		System.out.println("Finish...");

	}

}
