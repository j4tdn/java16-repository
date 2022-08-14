package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] arges) {
		Random rd= new Random();
		//Random 1 số nguyên ngẫu nhiên
		
		int arbitraryNumber = rd.nextInt();//0 -->2^32(dùng biến kiểu int rồi .nextInt là cho nhập vào số nguyên)
		System.out.println("arbitrayNumber " + arbitraryNumber);
		
		//random 1 số nguyên ngẫu nhiên  nhỏ hơn n(0-n)
		
		int secondRand = rd.nextInt(10);
		System.out.println("SecondRand " + secondRand);
		
		//random 1 số ngẫu nhiên trong 1 khoản giá trị
		//101 102 103 104 105
		
		int rangeRand = 100 + rd.nextInt(105-100+1);
		System.out.println("rangeRand " + rangeRand);
	}

}
