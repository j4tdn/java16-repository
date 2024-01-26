package view;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Ex07 {

	public static void main(String[] args) {
		String a ="aa___heloo123";
		System.out.println(CodelandUsernameValidation(a));
	}

	public static String CodelandUsernameValidation(String str) {
		if(str.length()<4 && str.length()>25) {
			return "false";
		}
		char firstStr = str.charAt(0);
		if(!Character.isLetter(firstStr)) {
			return "false";
		}
		for(int i =0;i<str.length();i++) {
			char currentStr = str.charAt(i);
			if(!Character.isLetterOrDigit(currentStr)&&currentStr !='_') {
				return "false";
			}
		}
		if(str.charAt(str.length()-1) =='_') {
			return "false";
		}
		return "true";
	}
}