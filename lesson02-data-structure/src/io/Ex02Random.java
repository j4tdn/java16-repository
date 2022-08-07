package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//1.Random 1 số nguyên ngẫu nhiên
		int arbitraryNumber = rd.nextInt(); // -2^32 - 2^32-1
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		// 2. Randon một số ngâu nhiên từ 1-n
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand: " +secondRand);
		
		//3.Randon 1 số ngẫu nhiên trong khoảng giá trị 100, 101, 102, 103, 104, 105
		//radom(a,b) = a + random)b-a+1)
		int rangeRand = 100 + rd.nextInt(1-5-100+1);
		System.out.println("rangeRand: " +rangeRand);
	}
}
