package ex03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Vietnamese {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Vietnamese string : ");
		String vn = ip.nextLine();
		System.out.println("After remove accent : " + removeAccent(vn));

		ip.close();

	}

	public static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}
}
