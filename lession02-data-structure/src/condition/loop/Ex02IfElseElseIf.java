package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] arges) {
		// Random điểm ngẫu nhiên 1-10
		Random rd = new Random();
		int point = 1 + rd.nextInt(10);
		if (point < 5) {
			System.out.println("Hoc luc yếu ");
		}
		if (point >= 5 && point < 8) {
			System.out.println("hoc luc tb ");
		} else {
			System.out.println("hoc luc gioi");
		}
		// nếu điểm < 5 ==>học lực trung bình

		// nếu điểm >=5 và <8 học lực trung bình

		// nếu điểm >=8 học lục giỏi
		System.out.println("finish");
	}

}
