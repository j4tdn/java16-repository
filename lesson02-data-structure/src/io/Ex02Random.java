package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//1.random 1 số nguyên ngẫu nhiên
		int arbitraryNumber = rd.nextInt();
		System.out.println("arbitraryNumber : " + arbitraryNumber);
		//2.Random 1 số nguyên ngẫu nhiên từ 0 đến N
		int secondRan = rd.nextInt(10);
		System.out.println("secondRan: " + secondRan);
		//3.random 1 số ngẫu nhiên trong khoảng giá trị
		//random(a,b)=a + random(a-b)
		int rangeRan = 100 + rd.nextInt(5);
		System.out.println("rangeRan " + rangeRan);
	}

}
