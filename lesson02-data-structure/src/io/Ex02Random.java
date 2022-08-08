package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//1. Random mot so nguyen ngau nhien
		int arbitraryNumer = rd.nextInt();
		System.out.println("arbitraryNumer: " + arbitraryNumer);
		
		//2. Random mot so ngau nhien nho hon N [0-n)
		int seccondRand = rd.nextInt(10);
		System.out.println("seccondRand: " + seccondRand);
		
		//3. Random mot so ngau nhien trong khoang gia tri
		// 100,101,102,103,104,105
		
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand: " + rangeRand);
	}
}
