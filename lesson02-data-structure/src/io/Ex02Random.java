package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// 1. Random 1 so ngau nhien
		int arbitraryNumber = rd.nextInt();// -2^16 -> 2^16
		System.out.println("arbitraryNumber: " + arbitraryNumber);

		// 2. Random 1 so ngau nhien nho hon N [0-N)
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand: " + secondRand);

		// 3. Random 1 so ngau nhien trong khoang gia tri
		// 100, 101, 102, 103, 104, 105
		int rangeRand = 100 + rd.nextInt(6);
		System.out.println("rangeRand: " + rangeRand);
	}
}
