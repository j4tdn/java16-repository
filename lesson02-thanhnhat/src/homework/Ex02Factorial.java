package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02Factorial {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Số các số cần tính là: ");
		int dem = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= dem; i++) {
			int rdn = rd.nextInt(5);
			System.out.println("Number random: " + rdn);
			int ft = 1;
			for (int x = 1; x <= rdn; x++) {
				ft = ft * x;
			}
			sum = sum + ft;
		}
		System.out.println("Tổng là: " + sum);
	}

}
