package view;

/**
 * 	Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
	được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần
	tử lớn nhất trong cột của nó.
	47 47 36
	23 43 31
	46 7 29
	Theo ví dụ trong bảng số sau đây thì phần tử A02 chính là phần tử yên ngựa.
	Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có
	phần tử yên ngựa hay không?
 */

import java.util.Random;
import java.util.Scanner;
import bean.Digit;
import utils.DigitUtils;

public class Ex03Saddle {
	public static void main(String[] args) {
		int[][] digits = new int[3][4];
		random2DArray(digits);
		print2DArray(digits);
		DigitUtils.printf(saddle(digits));

	}

	private static void import2DArray(int digits[][]) {
		int rows = digits.length;
		int columns = digits[0].length;
		Scanner ip = new Scanner(System.in);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("digits[" + i + "]" + "[" + j + "] = ");
				digits[i][j] = ip.nextInt();
			}
		}
	}

	private static void random2DArray(int digits[][]) {
		int rows = digits.length;
		int columns = digits[0].length;
		Random rd = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				digits[i][j] = rd.nextInt(100);
			}
		}
	}

	private static void print2DArray(int digits[][]) {
		int rows = digits.length;
		int columns = digits[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(digits[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static Digit[] saddle(int digits[][]) {
		int rows = digits.length;
		int columns = digits[0].length;
		Digit[] saddle = new Digit[rows >= columns ? rows : columns];
		int lengthOfSad = 0;
		int row;
		int col;
		int max;
		int min;

		for (int i = 0; i < rows; i++) {
			min = digits[i][0];
			col = 0;
			for (int j = 1; j < columns; j++) {
				if (min > digits[i][j]) {
					min = digits[i][j];
					col = j;
				}
			}

			max = digits[0][col];
			row = 0;
			for (int k = 1; k < rows; k++) {
				if (max < digits[k][col]) {
					max = digits[k][col];
					row = k;
				}
			}

			if (max == min) {
				saddle[lengthOfSad] = new Digit(max, row, col);
				lengthOfSad++;
			}
		}

		return DigitUtils.cropArray(saddle, lengthOfSad);
	}
}
