package condition.loop;

import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		// Random điểm ngẫu nhiên từ [ 1 đến 10 ]
		Random rd = new Random();
		int point = 1 + rd.nextInt(10);
		System.out.println("point: " + point);
		
		// nếu điểm < 5 ==> hoc lực yếu
		if (point <5) {
			System.out.println("Học lực yếu "); 
			}
		// nếu điểm >= 8 và < 8  ==> học lực trung bình
		else if ( point >= 5 && point < 8) {
			System.out.println("Học lực trung bình");
		}
		
		// nếu điểm >= 8  ==> học lực giỏi
		else ( point <= 10) {
			System.out.println("Học lực giỏi");
		}
		System.out.println("......");
		
		System.out.println("Finish...!!!");
		
		}
}
