package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		
		// 1. Random so ngau nhien
		int arbitraryNumber = rd.nextInt();
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		// 2. Random so nho hon N
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand: " + secondRand);
		
		// 3. Random trong khoang gia tri 100, 101, 102, 103, 104, 105
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand: " + rangeRand);
	}

}
