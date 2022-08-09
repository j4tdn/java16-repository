package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	//random diem ngau nhien tu [1 den 10]
	//neu diem < 5 in ra hoc luc yeu
	//neu diem >= 5 va < 8 hoc luc trung bing
	//neu diem > 8 hoc luc xuat sac
	public static void main(String[] args) {
		Random rd = new Random();
		int point = rd.nextInt(1,11);
		System.out.println(point);
		if(point < 5 ) {
			System.out.println("hoc luc yeu");
		}
		else if(point >= 5 && point < 8){
			System.out.println("hoc luc trung binh");
			
		}
		else
		{
			System.out.println("hoc luc gioi");
		}
	}

}
