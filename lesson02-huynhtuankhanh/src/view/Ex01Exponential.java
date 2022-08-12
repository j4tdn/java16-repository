package view;

import java.util.Scanner;

public class Ex01Exponential {

	public static void main(String[] args) {
		int power;
		Scanner sc = new Scanner(System.in);
		System.out.print("power= ");
		power = sc.nextInt();
		if (power == 1) {
			System.out.println("is a power of 2");
		}else {
			if(power % 2 == 0){
				while (power % 2 == 0) {
					power = power / 2;
				}
				if (power == 1) {
					System.out.println("is a power of 2");
				}else {
					System.out.println("is not power of 2");
					}
			}else {
					System.out.println("is not power of 2");
				}
		}
		

	}

}
