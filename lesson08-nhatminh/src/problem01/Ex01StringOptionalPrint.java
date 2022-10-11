package problem01;

import java.util.Scanner;

public class Ex01StringOptionalPrint {
	public static void main(String[] args) {
		String str = getString();
//		In ra mỗi kí tự trên một dòng
		printEachChar(str);
		System.out.println("======");
//		In ra mỗi từ trên mỗi dòng
		printEachWord(str);
		System.out.println("======");
//		In ra chuỗi đảo ngược theo kí tự
		printEachCharReversed(str);
		System.out.println("======");
//		In ra chuỗi đảo ngược theo từ
		printEachWordReversed(str);
	}

	private static String getString() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập chuỗi: ");
			result = sc.nextLine();
			if (result.matches(".*[^\\p{L}\\s].*"))
				System.out.println("Chỉ nhập chữ (có thể tiếng Việt) và Space!");
			else
				break;
		}
		return result;
	}

	private static void printEachChar(String str) {
		for (int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(i) + " ");
		System.out.println();
	}

	private static void printEachWord(String str) {
		String[] strList = str.trim().split("\\s+");
		for (String string : strList)
			System.out.println(string);
	}

	private static void printEachCharReversed(String str) {
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i) + " ");
		System.out.println();
	}

	private static void printEachWordReversed(String str) {
		String[] strList = str.trim().split("\\s+");
		for (int i = strList.length - 1; i >= 0; i--)
			System.out.println(strList[i]);
	}
}
