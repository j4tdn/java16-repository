package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int arbitraryNumber = rd.nextInt();
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand " + secondRand);
		
		
		int rangeRand = 100 + rd.nextInt(100-106+1);
		System.out.println("rangeRand: " + rangeRand);
	}
}
