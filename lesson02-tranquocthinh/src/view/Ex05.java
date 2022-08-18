package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		convertDecimalToBinary();
	}
	public static void convertDecimalToBinary() {
		int n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập số cần chuyển đổi: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n<=0);
		System.out.println("======SAU KHI CHUYỂN ĐỔI LÀ======");
		System.out.println(Integer.toBinaryString(n));
	}
}
