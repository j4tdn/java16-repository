package condition.loop;

import java.util.Random;

public class Ex04switch {
public static void main(String[] args) {
	int month = 1 +new Random().nextInt(12);
	System.out.print(month+"co'");
	switch (month) {
	case 1,3,5,7,8,10,12:
		System.out.print("31 ngay");
		break;
	case 4,6,9,11:
		System.out.print("30 ngay");

		break;
	}
}
}
