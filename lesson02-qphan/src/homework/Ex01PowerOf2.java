package homework;

import java.util.Random;

// class name: noun
// method name: [phase]verb
// naming convention: camel case
// first letter of class --> Upper
// first letter of variable, method --> Lower
// package-name: lower
// project-name: lower
// Bài 1: Viết chương trình kiểm tra 1 số có phải 
// là lũy thừa của 2 hay không
public class Ex01PowerOf2 {
	public static void main(String[] args) {
		int[] numbers = {2, 0, 1, 4, 8, 22, 33, 128, 100};
		// B1: fetch, xóa nhánh bt hiện tại, tạo nhánh từ origin/lesson02-exercises
		for (int number: numbers) {
			// 1st way
			System.out.println(number + " ==> " + isPowerOf2(number));
			System.out.println(number + " ==> " + isPowerOf(2, number));
		}
		
		// 2nd way
		// b is power of a ==> a^n = b ==> Condition (b>0, n is integer)
	}
	
	private static boolean isPowerOf(int a, int b) {
		if (b <= 0) {
			return false;
		}
		double n = Math.log(b)/Math.log(a); // 2.2 2.6 2.5 3.0 4.0
		return Math.ceil(n) == Math.floor(n);
	}
	
	private static boolean isPowerOf2(int number) {
		if (number <= 0) {
			return false;
		}
		while(number != 1) {
			if (number % 2 != 0) {
				return false;
			}
			number /= 2;
		}
		return true;
	}
}
