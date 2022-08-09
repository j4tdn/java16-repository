package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.println(month);
		
	   switch (month) {
	case 1,2,3,4,5,7,8,9: 
		System.out.println("in ra");
		break;

	default:
		break;
	}
	}

}
