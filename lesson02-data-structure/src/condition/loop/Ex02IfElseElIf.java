package condition.loop;

import java.util.Random;

public class Ex02IfElseElIf {
	public static void main(String[] args) {
		// Random diem ngau nhien tu 1 -> 10
		
		// Neu diem < 5 ==> hoc luc yeu
		
		// Neu diem >=5 va < 8  ==> hoc luc tb
		
		// Neu diem >=8 ==> hoc luc gioi
		
		Random rd = new Random();
		
		int point = 1 + rd.nextInt(10-1+1);
		
		System.out.println("point is: " + point);
		if(point>=0 && point<5) {
			System.out.println("Học lực yếu");
		} else if(point>=5 && point<8) {
			System.out.println("Học lực trung bình");
		} else if(point<=10) {
			System.out.println("Học lực giỏi");
		} else {
			System.out.println("Điểm không hợp lệ");
		}
	}
}
