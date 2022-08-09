package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//random 1 so ngau nhien
		int aribitraryNumber = rd.nextInt(1, 100);
		System.out.println(aribitraryNumber);
		
		int secondNumber = (aribitraryNumber-26);
		System.out.println(secondNumber-aribitraryNumber+82);
		
		int thirdNumber = rd.nextInt(600-500);
		System.out.println(thirdNumber);
		
	}

}
