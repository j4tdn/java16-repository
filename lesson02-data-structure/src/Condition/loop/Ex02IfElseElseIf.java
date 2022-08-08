package Condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		Random rd = new Random();
		int ran = 1 + rd.nextInt(9);
		System.out.println("ran :" + ran);
		if (ran < 5) {
			System.out.println("học lực yếu");
		}
		else if ( ran <=8) {
			System.out.println("trung bình");
		}
		else  {
			System.out.println("giỏi");
		}
	}

}
