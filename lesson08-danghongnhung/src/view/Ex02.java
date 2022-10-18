package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String name = inputName();
		System.out.println(formatName(name));
		
	}
	
	private static String inputName() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		while(true){
			System.out.print("Input name: ");
			name = sc.nextLine();
			if(name.matches(".*[^\\p{L}\\s].*")){
				System.out.println("including the characters [A-Za-z ] and space only!");
			}
			else break;
		}
		return name;
	}
	
	private static String formatName(String name) {
		String newName = "";
		String[] listName = name.toLowerCase().trim().split("[\\s]+");
		for(String text : listName) {
			text = text.substring(0, 1).toUpperCase() + text.substring(1, text.length());
			newName += text + " ";
		}
		return newName;
	}
	

}
