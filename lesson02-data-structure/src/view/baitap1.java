package view;

import java.util.Scanner;

public class baitap1 {
	private void mian() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number, reverse = 0, n;
		System.out.println("Nhập vào số cần kiểm tra: ");
		number = sc.nextInt();
		n = number;
		while(number!= 0) {
			int num = number % 10;
			n = n * 10 + num;
			number /= 10;	
		}
		if(reverse == n) {
			System.out.println( n+ "là số đối xứng");
		}
		else {
			System.out.println(n +"không phải số đối xứng");
		}
	}
}
