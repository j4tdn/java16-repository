package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int arbitrary = rd.nextInt();
		System.out.println("arbitraryNumber:"+arbitrary);
		
		
		int secondRand = rd.nextInt(10);
		System.out.println(secondRand);
		// random(a,b) = a +random(b-a+1)
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand:"+rangeRand);
	}
}
