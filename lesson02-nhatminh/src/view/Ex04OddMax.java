package view;

import java.util.Scanner;

public class Ex04OddMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrStr = str.split(" ");
		System.out.println("Ket qua: " + OddMax(arrStr));
	}

	public static Integer OddMax(String[] arrStr) {
		Integer result = null;
		for (String s : arrStr) {
			int temp = Integer.parseInt(s);
			if (temp % 2 != 0) {
				if (result == null)
					result = temp;
				else {
					if (temp > result)
						result = temp;
				}
			}
		}
		return result;
	}
}
