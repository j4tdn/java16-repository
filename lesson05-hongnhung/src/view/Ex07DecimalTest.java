package view;

import java.util.Scanner;

public class Ex07DecimalTest {

	// Tìm phân số tối giản được tạo ra từ số thập phân
	// 0.1 1/10
	// 0.2 1/5
	// 0.25 25/100
	// 0.4 4/10
	// 0.005 5/1000
	// 0.1 10/10
	// 1.2 12/100
	// 12.5 125/100
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập số đi nào: ");
			String num = ip.next();
			System.out.println("Phân số tối giản: " + minimumFraction(num));
		}

	}
	public static int numerator(String num) {
		String tmp = "";
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) != '.')
				tmp += num.charAt(i);
		}

		return Integer.parseInt(tmp);
	}

	public static int denominator(String num) {
		int tmp = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '.') {
				tmp = i;
				break;
			}
		}

		return (int) Math.pow(10, num.length() - tmp - 1);
	}
	//Greater common divisor
	public static int GCD(int num1, int num2) {
		while(num1 != num2) {
			if (num1 > num2)
				return GCD(num1 - num2, num2);
			else if (num2 > num1)
				return GCD(num1, num2 - num1);
		}
		return num1;
	}

	public static String minimumFraction(String num) {
		double n = Double.parseDouble(num);
		String tmp = Double.toString(n);
		int nu = numerator(tmp);
		int de = denominator(tmp);
		int gcd = GCD(nu, de);
		nu = nu / gcd;
		de = de / gcd;
		return nu + "/" + de;

	}

	
}
