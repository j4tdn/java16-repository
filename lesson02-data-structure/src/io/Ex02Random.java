package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		int abitraryNumber = rd.nextInt();
		System.out.println(" AbitraryNumber "+ abitraryNumber);
		
		int seconRandom = rd.nextInt(10);
		System.out.println(" AbitraryNumber "+ seconRandom);
		
		int thirRandom= 100 + rd.nextInt(100 -95);
		System.out.println(" AbitraryNumber "+ thirRandom);
	}

}
