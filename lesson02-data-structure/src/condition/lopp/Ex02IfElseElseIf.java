package condition.lopp;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
//		Radom diem ngau nhien tu 1 den 10

//		Neu diem < 5 ==> Hoc luc yeu
//		Neu diem >=5 && < 8 ==> Hoc luc trung binh
//		Nei diem >= 8 ==>Hoc luc gioi
		Random rd = new Random();
		int pointScore = 1 + rd.nextInt(10);
		System.out.println("pointScore: " + pointScore);
		if (pointScore >= 0 && pointScore < 5) {
			System.out.println("hoc luc yeu");
		} else if (pointScore < 8) {
			System.out.println("hoc luc trung binh");
		} else if (pointScore <= 10) {
			System.out.println("hoc luc gioi");
		} else
			System.out.println("khong hop le !!!");
	}

}
