package view;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		String string = "aaabaaabbbaaaaa";
		commonString(string);
	}

	private static void commonString(String s) {
		int strA = 0, strB = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int index = 0;
		while (index < s.length()) {
			int count = 0;
			for (int j = index; j < s.length(); j++) {
				if (s.charAt(index) == s.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			if (count > max) {
				max = count;
				strA = index;
			}
			if (count < min) {
				min = count;
				strB = index;
			}
			index = index + count;
		}
		System.out.println(max + " \"" + s.substring(strA, strA + max) + "\" [" + strA + "]");
		System.out.println(min + " \"" + s.substring(strB, strB + min) + "\" [" + strB + "]");
	}
}
