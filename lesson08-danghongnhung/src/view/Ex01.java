package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String text = input();
		System.out.println("1. ");
		print(text);
		
		String[] tokens = text.split("[\\s]+");
		System.out.println("2.");
		printf(tokens);
		
		StringBuffer textBuffer = new StringBuffer(text);
		System.out.println("3. " + textBuffer.reverse().toString());
		
		System.out.println("4.");
		printReverse(tokens);
		
		
	}
	
	private static String input() {
		Scanner sc = new Scanner(System.in);
		String text = "";
		while(true) {
			System.out.println("input text: ");
			text = sc.nextLine();
			if(text.matches(".*[^\\p{L}\\s].*")){
				System.out.println("including the characters [A-Za-z ] and space only!");
			}
			else break;
		}
		return text;
	}
	private static void print(String text) {
		text = text.replaceAll(" ", "");
		for(int i = 0 ; i < text.length(); i++) {
				char kyTu = text.charAt(i);
					
				System.out.println(kyTu);
			}
		
	}
	
	
	private static void printf(String[] tokens) {
		for(String token : tokens) {
			System.out.println(token);
		}
	}
	
	private static void printReverse(String[] tokens) {
		for(int i = tokens.length-1; i>=0; i--) {
			System.out.print(tokens[i] + " ");
		}
	}
	
	
	
}

