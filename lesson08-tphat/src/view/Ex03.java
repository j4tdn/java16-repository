package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s;
		System.out.println("Nhập chuỗi: ");
		s = ip.nextLine();
		System.out.println(removeAccent(s));
	}

	public static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}

}
