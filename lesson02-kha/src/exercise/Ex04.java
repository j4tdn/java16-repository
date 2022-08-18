package exercise;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap vao 1 day so` nguyen :");
		String text = ip.nextLine();
		String[] arrAstext = text.split(" ");
		System.out.println("so le? lon` nhat la`  : " + findBiggerOddNumber(arrAstext));
		
	}
	
	private static int findBiggerOddNumber(String[] arr) {
		int max = -9999;
		for (String i : arr) {
			int tmp = Integer.parseInt(i);
			if(tmp%2!=0 && tmp>max) max = tmp;
		}
		return max;
	}
}
