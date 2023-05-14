package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("---------------");
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // remove leading and trailing white spaces
        s = s.trim();
        
        if(s.length()==0) {
        	System.out.println("0");
        	return;
        }
        
        String[] words = s.split("[^a-zA-Z]+");
        
        System.out.println(words.length);
        for(String word :words) {
        	System.out.println(word);
        }
        
    }
		
		
		
		
		
	}


