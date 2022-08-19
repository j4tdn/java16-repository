package condition.loop;

import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		//Random điểm ngẫu nhiên từ [1 đến 10]
		Random rd = new Random();
		int point = 1 + rd.nextInt(10);
		System.out.println("point" + point);
		if(point>=0 && point <5) {
			System.out.println("Học lực yếu"+ point);
			
		}
		else if(point <8) {
			System.out.println("Học lực trung bình"+ point);
			
		}
		else if(point <=10) {
			System.out.println("Học lực giỏi"+ point);
			
		}else {
			System.out.println("Điểm không hợp lệ...");
		}
		//Nếu điểm < 5  ==> học lực yếu
		
		//Nếu điểm > 5 và < 8 ==> học lực trung bình
		
		//Nếu điểm >=8 ==> học lực giỏi
		
	}
}
