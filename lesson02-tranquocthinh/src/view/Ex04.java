package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập số lượng phần tử trong mảng: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		int[] arrays = new int[n];

		System.out.println("===NHẬP SỐ LƯỢNG PHẦN TỬ CỦA MẢNG===");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + " : ");
			arrays[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("======HIỂN THỊ CÁC PHẦN TỬ VỪA NHẬP=====");
		for (Integer items : arrays) {
			System.out.println(items);
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (checkOddNumber(arrays[i]) == true) {
				if (max < arrays[i]) {
					max = arrays[i];
				}
			}
		}
		System.out.println("Số chẵn lớn nhất trong mảng là: " + max);
	}

	public static boolean checkOddNumber(int n) {
		return (n % 2 != 0);
	}
}
