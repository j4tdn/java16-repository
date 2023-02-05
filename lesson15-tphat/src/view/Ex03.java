package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("1. Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không \n"
				+ anagram("Word", "worrd"));

		System.out.println("2. Viết chương trình. Tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.");
		characterCounted("aaaccdcee");
	}

	public static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] text1 = s1.toCharArray();
		char[] text2 = s2.toCharArray();
		Arrays.sort(text1);
		Arrays.sort(text2);
		return Arrays.equals(text1, text1);
	}

	public static void characterCounted(String string) {
		char[] arr = string.toCharArray();
		HashMap<Character, Integer> result = new HashMap<>();

		for (char element : arr) {
			if (result.containsKey(element)) {
				result.put(element, result.get(element) + 1);
			} else {
				result.put(element, 1);
			}
		}
		int count = 0;
		Set<Character> set = result.keySet();
		for (char element : set) {
			if (result.get(element) > count) {
				count = result.get(element);
			}
		}

		for (char element : result.keySet()) {
			if (result.get(element).equals(count)) {
				System.out.print(element + " ");
			}
		}
	}

}
