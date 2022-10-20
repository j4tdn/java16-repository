package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("Enter String ...\n");
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		s = s.toLowerCase();
		String[] words = s.split("\\s");
		for (String w : words) {
			String firstLetter = w.substring(0, 1);
			   
		    String remainingLetters = w.substring(1, w.length());
		 
		    
		    firstLetter = firstLetter.toUpperCase();
		 
		    
		    w = firstLetter + remainingLetters;
			

		

		System.out.print(w + " ");
		}
		sc.close();

	}

	
}
