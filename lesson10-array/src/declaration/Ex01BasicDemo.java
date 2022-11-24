package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mang: KDL doi tuong
		 * +mang nguyen thuy: int[], double[], float[]		 
		 * + Mang doi tuongj: Integer [], String [], Item[]
		 * */
		// khai bao va khoi tao
		
		char[] letters = new char[5];
		// 5 phan tu mang gia tri mac dinh
		int[] digits = {2, 5 , 8, 10};
		int[] numbers = getNumbers();
		
		System.out.println("digits: " + Arrays.toString(letters));
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits: " + Arrays.toString(numbers));
		// Khai bao va khoi tao KDT
		String[] sequences = new String[6];// 6 phan tu NULL
		Double[] salesPrices = {3.3, 5.2,9.2};
		
		System.out.println("sequences: " +Arrays.toString(sequences));
		System.out.println("salesPrices: "+Arrays.toString(salesPrices));
		
	}
	private static int[] getNumbers() {
		return new int[] {2, 5 , 8, 10};
		 
	}
}
