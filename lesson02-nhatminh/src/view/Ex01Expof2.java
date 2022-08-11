package view;

import java.util.Scanner;

public class Ex01Expof2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of test case: ");
		int Try = Integer.parseInt(sc.nextLine());
		while (Try-- != 0) {
			System.out.print("Nhap so muon xet: ");
			int n = Integer.parseInt(sc.nextLine());
			if (IsExpof2(n))
				System.out.println(n + " la luy thua cua 2!");
			else
				System.out.println(n + " khong la luy thua cua 2!");
		}
		System.out.println("Finish!!!");
	}

	public static boolean IsExpof2(int n) {
		if (n % 2 == 0) {
			n /= 2;
			if (n == 1)
				return true;

		} else
			return false;
		return IsExpof2(n);
	}
}
