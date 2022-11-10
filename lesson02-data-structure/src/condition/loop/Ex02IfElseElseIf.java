package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		// Random điểm ngẫu nhiên từ [1 đến 10]
		Random rd = new Random();
		int point = 1 + rd.nextInt(10);
		System.out.println("point: " + point);
		if (point >= 0 && point < 5) {
			System.out.println("Học lực yếu");
		} else if (point < 8) {
			System.out.println("Học lực trung bình");
		} else if (point <= 10) {
			System.out.println("Học lực giỏi");
		} else {
			System.out.println("Điểm không hợp lệ");
		}
		
		System.out.println("Finish ...");
		
		// Nếu điểm < 5 ==> Học lực yếu
		
		// Nếu điểm >= 5 và < 8 ==> Học lực trung bình
		
		// Nếu điểm >= 8 ==> Học lực giỏi
	}
}
