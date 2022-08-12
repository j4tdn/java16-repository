package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		// Random điểm ngẫu nhiên từ [1, 10]
		
		// Nếu điểm < 5 ==> học lực yếu
		// Nếu điểm >= 5 và < 8 ==> học lực trung bình
		// Nếu điểm >= 8 ==> học lực giỏi
	
		int score;
		Random ip = new Random();
		score = 1 + ip.nextInt(10);
		
		System.out.println("point : " + score);
		if(score < 5)
		{
			System.out.println("Học lực yếu");
		}
		else if(score >= 5 && score < 8)
		{
			System.out.println("Học lực trung bình");
		}
		else
		{
			System.out.println("Học lực giỏi");
		}
	}
}
