package Condition.loop;
import java.util.Random;
public class Ex04SwitchCaseWithoutBreak {







	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		switch (month) {
		case 1:
			System.out.println("31 ngày");
			break;
		case 2:
			System.out.println("28 ngày");
			break;
		case 3:
			System.out.println("31 ngày");
			break;
		case 4:
			System.out.println("30 ngày");
			break;
		case 5:
			System.out.println("31 ngày");
			break;
		case 6:
			System.out.println("30 ngày");
			break;
		case 7:
			System.out.println("31 ngày");
			break;
		case 8:
			System.out.println("31 ngày");
			break;
		case 9:
			System.out.println("30 ngày");
			break;
		case 10:
			System.out.println("31 ngày");
			break;
		case 11:
			System.out.println("30 ngày");
			break;
		case 12:
			System.out.println("30 ngày");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
	}

}
