package condition.loop;

import java.util.Random;

public class Ex02IfElseIElseIf {

	public static void main(String[] args) {
		//Random điểm ngẫu nhiên từ 1-10
		Random rd = new Random();
		int point = rd.nextInt(10) + 1;
		System.out.println("Point : " + point);
		// Nếu điểm < 5 ==> Học lực yếu
		if(point < 5) {
			System.out.println("Học lực yếu");
		}else if(point < 8) {				// Nếu điểm >= 5 ==> Học lực trung bình
			System.out.println("Học lực trung bình");
		}else if(point <= 10) {							// Nếu điểm >= 8 ==> Học lực giỏi
			System.out.println("Học lực giỏi");
		}else {
			System.out.println("Điểm không hợp lệ");
		}
		
		
				
	}

}
