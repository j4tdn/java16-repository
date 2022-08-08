package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// 1. Random 1 số nguyên ngẫu nhiên
		int arbitraryNumber = rd.nextInt(); // 
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		// 2. Random 1 số nguyên ngẫu nhiên nhỏ hơn N [0 - N)
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand: " + secondRand);
		
		// 3. Random 1 số ngẫu nhiên trong khoảng giá trị
		// 100, 101, 102, 103, 104, 105
		// random(c, b) = a+ random(b-a+1)
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand: " + rangeRand);
	}

}
