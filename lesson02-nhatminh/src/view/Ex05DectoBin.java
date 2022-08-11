package view;

import java.util.Scanner;
import java.util.Stack;

public class Ex05DectoBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so test case: ");
		int Try = Integer.parseInt(sc.nextLine());
		while (Try-- != 0) {
			System.out.print("Nhap so can convert: ");
			int n = Integer.parseInt(sc.nextLine());
			System.out.print("Sau khi convert: " + DectoBin(n));
		}
	}

	public static String DectoBin(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		while (n != 1) {
			if (n % 2 == 0)
				stack.push(0);
			else
				stack.push(1);
			n /= 2;
		}
		stack.push(1);
		String result = "";
		while (!stack.empty()) {
			result += stack.pop();
		}
		return result;
	}
}
