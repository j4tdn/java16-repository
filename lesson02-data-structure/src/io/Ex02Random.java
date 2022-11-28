package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// 1.random 1 số nguyên ngẫu nhiên
		int arbitraryNumber = rd.nextInt();
		System.out.println("Random number: " + arbitraryNumber);

		// 2 random 1 số nguyên ngẫu nhiên nhỏ hơn N[0-N)
		int scrd = rd.nextInt(10);
		System.out.println("Seceond Random: " + scrd);

		// 3 random 1 số ngẫu nhiên trong khoảng giá trị
		// 100,101,102,103,104,105
		int rangeRand = 100 + rd.nextInt(105 - 100 + 1);
		System.out.println("Range Random: " + rangeRand);
	}
}
