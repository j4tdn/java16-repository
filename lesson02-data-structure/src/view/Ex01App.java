package view;

import java.time.LocalDate;

import datastruture.Ex01Declare;

public class Ex01App {
	public static void main(String[] args) {
		System.out.println("lesson02 demo");
		System.out.println("publish date: " + LocalDate.now());
		
		// Class.staticAttribute
		System.out.println("LargeNumber: " + Ex01Declare.largeNumber);
	}
}
