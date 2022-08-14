package condition.loop;

import java.util.Random;

public class Ex03SwichCase {
	public static void main(String[]arges) {
		int month = 1 + new Random().nextInt(12);
	switch (month) {
	case 1:
		System.out.println("31 ngay");
		break;
	case 2:
		System.out.println("28 ngay");
		break;
	case 3:
		System.out.println("31 ngay");
		break;
	case 4:
		System.out.println("30 ngay");
		break;
	case 5:
		System.out.println("31 ngay");
		break;
	case 6:
		System.out.println("30 ngay");
		break;
	case 7:
		System.out.println("31 ngay");
		break;
	case 8:
		System.out.println("31 ngay");
		break;
	case 9:
		System.out.println("30 ngay");
		break;
	case 10:
		System.out.println("31 ngay");
		break;
	case 11:
		System.out.println("30 ngay");
		break;
	case 12:
		System.out.println("31 ngay");
		break;	

	default:
		System.out.println("khong hop le ");
	}

	}

}
