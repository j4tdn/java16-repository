package view;

import java.math.BigInteger;
import java.util.Random;

public class Ex02SumofFactorial {
	// S = a! + b! + c! + d!
	public static void main(String[] args) {
		int a = GetRandom();
		int b = GetRandom();
		int c = GetRandom();
		int d = GetRandom();

		System.out.println("Ket qua cua bieu thuc S = " + a + "! + " + b + "! + " + c + "! + " + d + "!: ");
		System.out.println(Factorial(a).add(Factorial(b)).add(Factorial(c)).add(Factorial(d)));
	}

	public static int GetRandom() {
		Random rd = new Random();
//		return Math.abs(rd.nextInt());// Too long exec
		return rd.nextInt(100);
	}

	public static BigInteger Factorial(int n) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
