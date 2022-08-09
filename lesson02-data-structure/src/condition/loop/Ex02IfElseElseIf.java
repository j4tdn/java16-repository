package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		Random rd = new Random();
		int point = 1 + rd.nextInt(11);
		System.out.println("point: " + point);
		if (point >= 0 && point  < 5) {
			System.out.println("yeu");
		}else {
			if (point < 8 ) {
				System.out.println("kha ");
			}else {
				if (point <= 10) {
					System.out.println("gioi");
				}else {
					System.out.println("diem lon hon 10 m bi ngu a");
				}
			}
		}
		
	}

}
