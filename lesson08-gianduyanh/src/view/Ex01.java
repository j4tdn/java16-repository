package view;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		String s = "dẫu có lỗi lầm";
		if (vietNameUniKey(s) == true) {
			System.out.println("Chuoi da nhap dung voi yeu cau");

		}

		else {
			System.out.println("Nhap lai");
		}
		System.out.println(" ====== Cau 1 =====");
		s.chars().forEach(a -> System.out.println((char) a));

		System.out.println(" ====== Cau 2 =====");
		String[] da = s.split(" ");
		printf(da);

		System.out.println(" ====== Cau 3 =====");

		StringBuilder s1 = new StringBuilder(s);
		s1.reverse().chars().forEach(a -> System.out.println((char) a));

		System.out.println(" ====== Cau 4 =====");

		Arrays.asList(s1.toString().split(" ")).forEach(a -> System.out.println(a));

	}

	private static boolean vietNameUniKey(String s) {
		if (s.matches("[A-Za-z\\p{L}\\s]+")) {
			return true;
		}
		return false;
	}

	private static void printf(String[] s) {
		Arrays.asList(s).forEach(a -> System.out.println(a));
	}

}
