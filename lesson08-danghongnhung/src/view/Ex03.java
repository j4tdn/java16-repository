package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String text = input();
		System.out.println(text);
		System.out.println("================================");
		System.out.print(removeAccent(text));
		//System.out.println(reWrite(text));
	}
	
	private static String input() {
		Scanner sc = new Scanner(System.in);
		String text = "";
		while(true) {
			System.out.println("input text: ");
			text = sc.nextLine();
			if(text.matches(".*[^\\p{L}\\s].*")) {
				System.out.println("Input String TIẾNG VIỆT!!!");
			}
			else 
				break;
		}
		return text;
	}
	
	 public static String removeAccent(String s) {  
		  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		  return pattern.matcher(temp).replaceAll("").replace("Đ", "D").replaceAll("đ", "d");
	 }
	 
	

}
