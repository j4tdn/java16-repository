package condision.loop;

import java.util.Random;

public class ExIfElseElseIf {
public static void main(String[] args) {
	//Random điểm ngẫu nhiên từ [1 đến 10]
	// Nếu điểm < 5 ==> Học lực yếu
	//Nếu điểu >= 5 và < 8 ==> Học lực trung bình
	//Nếu điểm >= 8 ==> Học lực giỏi
	Random rd = new Random();
	int point = 1 + rd.nextInt(10);
	System.out.println("point:"+point);
	if (point < 5) {
		System.out.println("Học lực yếu");
	}else if (point<8) {
		System.out.println("Học lực trung bình");
	}else if (point <=10){
		System.out.println("Học lực giỏi");
		
		
	}
	
}
}
