package view;

import java.util.Scanner;

public class Ex05LongestCommonString {
	public static void main(String[] args) {
		String S1 = "ABCEDEABC";
		String S2 = "ABCEDCBBCK";
		System.out.println("S1: " + S1);
		System.out.println("S2: " + S2);
		System.out.println(longestCommonString(S1, S2));
		
	}
	
	private static String longestCommonString(String S1, String S2) {
		String result = "";
		 String tmp = "";
		 for(int i =0; i<S1.length(); i++) {
			 tmp += S1.charAt(i);
			 if(S2.contains(tmp)) {
				 if(result.length() < tmp.length()) {
					 result = tmp;
				 }
				 else 
					 tmp = ""+ S1.charAt(i);
			 }
		 }
		return result;
	}
	
	

}
