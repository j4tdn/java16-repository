package Ex02;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class Ex02 {
	public static void main(String[] args) {
		
		String s = "";
		System.out.println("nhap chuoi: ");
		Scanner ip = new Scanner(System.in);
		s = ip.nextLine();
				
		while (true) { 
			if (s.matches("[[a-zA-Z]\\s]+")) {
				System.out.println(normalize(s));
				break;
			} else {
				System.out.println("vui long nhap dung cu phap [a-zA-Z]: ");
				s = ip.nextLine();
			}
		}
		
	}	
	public static boolean isLower(String s) {
		String temp = s.toLowerCase();
		if (s.equals(temp)) {
			return true;
		} else {
		return false;
		}
	}
	
	public static boolean isUpper(String s) {
		String temp = s.toUpperCase();
		if (s.equals(temp)) {
			return true;
		} else {
		return false;
		}
	}
	
	public static String normalize(String s) {
		
		
		s = s.replaceAll("\\s+", " ").trim();
		String[] strings = s.split("");
		String string = strings[0].toUpperCase();
		for (int i = 1; i < strings.length; i++) {
			if (strings[i-1].equals(" ")) {
				if (isLower(strings[i])) {
					strings[i] = strings[i].toUpperCase();
				}
			} else {
				if (isUpper(strings[i])) {
					strings[i] = strings[i].toLowerCase();
				}
			}
			string += strings[i];
		}
		return string;
	}
	
}
