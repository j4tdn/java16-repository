package ex03;

import java.util.Arrays;

public class Ex03Anagram {
	public static void main(String[] args) {
		String string1 = "word";
		String string2 = "orWd";
		
		System.out.println("Is '" + string1 + "' and '" + string2 + "' is anagram? "+ checkAnagram(string1, string2));
		
	}
	
	public static boolean checkAnagram(String str1, String str2) {
		str1 = str1.trim().toLowerCase();
		str2 = str2.trim().toLowerCase();
		
		char[] arrStr1 = str1.toCharArray();
		char[] arrStr2 = str2.toCharArray();
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);

		return Arrays.compare(arrStr1, arrStr2) == 0;
	}

}
