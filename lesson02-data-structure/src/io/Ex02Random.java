package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		// 1. Random 1 số nguyên ngẫu nhiên
		// int 2^-31 -> 2^31 -1
		int arbitraryNumber = rd.nextInt();
		System.out.println("ArbitraryNumber : " + arbitraryNumber);
		// 2. Random 1 số nguyên ngẫu nhiên nhỏ hơn N [0-N)
		int secondRand = rd.nextInt(10);
		System.out.println("Second Rand : " + secondRand);
		// 3. Random 1 số nguyên ngẫu nhiên trong 1 khoảng giá trị
		//100, 101, 102, 103, 104, 105
		int rangeRand = 100 + rd.nextInt(105 - 100 + 1);
		System.out.println("Range Rand : " + rangeRand);
	}

}
