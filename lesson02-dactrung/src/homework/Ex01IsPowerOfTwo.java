package homework;

import java.util.Scanner;

public class Ex01IsPowerOfTwo {
	
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		System.out.println("KIỂM TRA 1 SỐ CÓ PHẢI LÀ LŨY THỪA CỦA 2");
		System.out.println("Nhập số: ");
		int n = cn.nextInt();
		if (checkPowerOfTwo(n) == true) {
			System.out.println(n + " là lũy thừa của 2.");
		} else
			System.out.println(n + " không phải là lũy thừa của 2.");
	}

	public static boolean checkPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y)
			return false;
		return checkPowerOfTwo(x);
	}
}
