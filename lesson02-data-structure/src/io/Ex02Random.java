package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// 1. Random 1 integer ngau nhien
		int arbitraryNumber = rd.nextInt();
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		// 2. Random 1 so nguyen ngau nhien nho hon N [0-N]
		int secondRand = rd.nextInt(10);
		System.out.println("SecondRand:" + secondRand);
		
		// 3.Random 1 so ngau nhien trong cai khoang gia tri 
		// 100, 101, 102, 103, 104, 105
		// random(a,b) = a + random(b-a+1)
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("randomRand:" + rangeRand);
	}
}
