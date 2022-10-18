package homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {

	public static void main(String[] args) {
		  
		String name = "";
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter name: ");
			name = sc.nextLine();
		}while(name.matches(".*[^\\p{L}\\s].*"));
		line2(name);
		
	}
	private static void line2(String name)
	{
		
		String[] strList = name.trim().split("\\s+");
		for (String string : strList) {
			string = string.substring(0, 1).toUpperCase() + string.substring(1,string.length()).toLowerCase();
			System.out.print(string + " ");
		}
	
	}
	
	

}
