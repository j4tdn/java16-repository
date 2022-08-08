package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// 1.Random 1 số nguyên ngẫu nhiên 
		// int -2 mũ 31 --> 2 mũ 31-1
		int arbitraryNumber = rd.nextInt(); // Integer.Min - Integer.Max
		System.out.println("arbitraryNumber: " + arbitraryNumber);
		
		// 2.Random 1 số nguyên mgaaux nhiên nhỏ hơn N [0-N)
		int secondRand = rd.nextInt();
		System.out.println("secondRand " + secondRand);
		
		// 3.Random 1 số ngẫu nhiên trog khoảng giá trị min100, 101, 102, 103, 104, max105
		// random(a, b) = a + random(b-a+1);
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand: " + rangeRand);
	}
}

