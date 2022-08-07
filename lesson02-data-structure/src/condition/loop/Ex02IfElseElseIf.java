package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int score = 1 + +rd.nextInt(10);
		System.out.println(score);
		 if(score <5)
			 System.out.println("Học lực yếu");
		 else if(score >=8)
			 System.out.println("Học lực giỏi");
		 else 
			 System.out.println("Học lực trung bình");
	}

}
