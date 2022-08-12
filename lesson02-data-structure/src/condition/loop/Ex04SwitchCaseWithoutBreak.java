package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
public static void main(String[] args) {
int month = 1 + new Random().nextInt(12);
	
	System.out.print("Tháng " + month);
	switch (month) {
	case 12:
		
	case 11:
		
	case 10:
		
	case 9:
	
	case 8:
		
	case 7:
	
	case 6:
		System.out.println("Tháng lớn hơn 5");
		break;
	case 5:
		
	case 4:
		
	case 3:
		
	case 2:
		
	case 1:
		System.out.println("Tháng bé hơn 5");
		break;

	default:
		System.out.println("Tháng không hợp lệ");
	}
}
}
