package ex03;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter String:");
		String input = ip.nextLine();
		
		String inputRmSpace = input.trim().replaceAll("\\s+", " ");
		String[] outputs=inputRmSpace.split("\\s");
		
		for(String output:outputs ) {
			System.out.print(reverseString(output)+" ");
		}
		
		ip.close();
	}
	
	private static String reverseString(String output) {
		String finalOutput="";
		StringBuilder outputRever= new StringBuilder(output);
		finalOutput=outputRever.reverse().toString();
		
		return finalOutput;
	}
}
