package homework;

import java.util.Scanner;

public class Ex03SymmetryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// khai bao bien num la so can kiem tra
		// reversed la so sau khi dao nguoc
		// original la bien de luu lai so can kiem tra
		int num, reversed = 0, original;
		System.out.println("Nhap vao so can kiem tra: ");
		num = sc.nextInt();
		// gan gia tri vua nhap vao cho bien original de so sanh voi reversed
		original = num;
		// su dung vong lap for de dao nguoc num
		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		// so sanh reversed voi original
		// neu bang nhau thi 2 so nay la doi xung
		if (reversed == original) {
			System.out.println(original + "la so doi xung!!");
		} else {
			System.out.println(original + "khong la so doi xung !!");
		}
	}
}
